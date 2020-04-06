package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.HibernateTaskRepository;
import org.dbts.repository.TaskRepository;

import java.util.List;

public class SimpleTaskService implements TaskService {

    private TaskRepository repository = new HibernateTaskRepository();

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }
}
