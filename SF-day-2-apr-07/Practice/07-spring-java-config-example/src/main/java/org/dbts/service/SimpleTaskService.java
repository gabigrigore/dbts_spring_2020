package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;

import java.util.List;

public class SimpleTaskService implements TaskService {

    private TaskRepository taskRepository;

    public SimpleTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
