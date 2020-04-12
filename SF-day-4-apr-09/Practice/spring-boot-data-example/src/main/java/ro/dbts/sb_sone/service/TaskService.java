package ro.dbts.sb_sone.service;

import ro.dbts.sb_sone.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();

    Task addTask(Task task);

    Task updateTask(Long id, Task task);

    Task findFirstById(Long id);

    Task removeTask(Long id);
}
