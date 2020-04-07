package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;

import java.util.List;

public class SimpleTaskService implements TaskService {

    private TaskRepository repository;

    /**
     * Used for autowire byName and byType
     */
    public SimpleTaskService() {}

    /**
     * Used for autowire by constructor
     * @param repository
     */
    public SimpleTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    /**
     * Used for autowire byName and byType. For byName also the name of the bean
     * must use beans convention connected to the bean name in application context XML file.
     * @param repository
     */
    public void setRepository(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }
}
