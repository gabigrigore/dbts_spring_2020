package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SimpleTaskService implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public SimpleTaskService() {}

    public SimpleTaskService(TaskRepository taskRepository) {
        System.out.println("Java Config: Service: constructor injection.");
        this.taskRepository = taskRepository;
    }

    public void setTaskRepository(TaskRepository taskRepository) {
        System.out.println("Java Config: Service: setter injection.");
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
