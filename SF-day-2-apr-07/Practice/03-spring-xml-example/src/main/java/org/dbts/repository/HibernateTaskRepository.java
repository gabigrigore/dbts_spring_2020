package org.dbts.repository;

import org.dbts.model.Task;

import java.util.ArrayList;
import java.util.List;

public class HibernateTaskRepository implements TaskRepository {

    @Override
    public List<Task> findAll() {

        List<Task> tasks = new ArrayList<>();
        Task task = new Task();
        task.setName("Task name one");
        task.setDescription("Task description one");

        tasks.add(task);

        return tasks;
    }
}
