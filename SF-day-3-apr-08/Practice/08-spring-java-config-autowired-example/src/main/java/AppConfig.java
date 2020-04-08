import org.dbts.repository.HibernateTaskRepository;
import org.dbts.repository.TaskRepository;
import org.dbts.service.SimpleTaskService;
import org.dbts.service.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.dbts"})
public class AppConfig {

    @Bean(name = "taskService")
    public TaskService getTaskService() {
        SimpleTaskService service = new SimpleTaskService();
        System.out.println("Java Config: create bean task service.");
        return service;
    }

    @Bean(name = "taskRepository")
    public TaskRepository getTaskRepository() {
        System.out.println("Java Config: create bean task repository.");
        return new HibernateTaskRepository();
    }
}
