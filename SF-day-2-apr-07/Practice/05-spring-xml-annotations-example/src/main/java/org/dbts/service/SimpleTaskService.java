package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("taskService")
public class SimpleTaskService implements TaskService {

    private TaskRepository repository;

    @Autowired
    public SimpleTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }
}
