import org.dbts.repository.HibernateTaskRepository;
import org.dbts.repository.TaskRepository;
import org.dbts.service.SimpleTaskService;
import org.dbts.service.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "taskService")
    public TaskService getCustomerService() {
        SimpleTaskService service = new SimpleTaskService();
        service.setTaskRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "taskRepository")
    public TaskRepository getCustomerRepository() {
        return new HibernateTaskRepository();
    }
}
