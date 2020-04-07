package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;

import java.util.List;

public class SimpleTaskService implements TaskService {

    private TaskRepository taskRepository;

    public void setTaskRepository(TaskRepository repository) {
        this.taskRepository = repository;
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
