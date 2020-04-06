import org.dbts.service.SimpleTaskService;
import org.dbts.service.TaskService;

public class App {

    public static void main(String[] args) {

        TaskService service = new SimpleTaskService();

        System.out.println(service.findAll().get(0).getName());
    }
}
