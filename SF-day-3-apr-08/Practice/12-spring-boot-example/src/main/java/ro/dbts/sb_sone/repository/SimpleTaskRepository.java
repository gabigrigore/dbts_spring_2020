package ro.dbts.sb_sone.repository;

import org.springframework.stereotype.Repository;
import ro.dbts.sb_sone.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("taskRepository")
public class SimpleTaskRepository implements TaskRepository {

    private List<Task> tasks;

/*  @Value("${databaseUser}")
  private String databaseUser;*/

    public SimpleTaskRepository() {

        this.tasks = new ArrayList<>();
        tasks.add(new Task(0, "nameA", "descA"));
        tasks.add(new Task(1, "nameB", "descC"));
        tasks.add(new Task(2, "nameC", "descD"));

    }

    @Override
    public List<Task> findAll() {
        //System.out.println("User : " + databaseUser);
        return tasks;
    }

    @Override
    public Task findFirstById(int id) {
        Optional<Task> task;
        task = tasks.stream()
                .filter(o -> o.getId() == id)
                .findFirst();
        return task.orElse(null);
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(int id) {
        tasks.removeIf(o -> o.getId() == id);
    }
}
