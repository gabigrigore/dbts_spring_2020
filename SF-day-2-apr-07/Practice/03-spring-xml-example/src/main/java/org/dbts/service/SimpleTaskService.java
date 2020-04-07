package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;

import java.util.List;

public class SimpleTaskService implements TaskService {

    private TaskRepository repository;

    public SimpleTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }
}
