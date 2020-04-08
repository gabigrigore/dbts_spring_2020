package ro.dbts.sb_sone.service;

import ro.dbts.sb_sone.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();

    Task findFirstById(int id);

    void removeTask(int id);

    void addTask(Task task);
}
