package ro.dbts.sb_sone.repository;

import ro.dbts.sb_sone.model.Task;

import java.util.List;

public interface TaskRepository {

    List<Task> findAll();

    Task findFirstById(int id);

    void addTask(Task task);

    void removeTask(int id);
}
