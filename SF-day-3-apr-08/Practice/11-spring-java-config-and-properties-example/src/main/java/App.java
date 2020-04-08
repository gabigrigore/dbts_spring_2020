import org.dbts.service.SimpleTaskService;
import org.dbts.service.TaskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        TaskService service = appContext.getBean("taskService", TaskService.class);

        System.out.println(service.findAll().get(0).getName());
    }
}
