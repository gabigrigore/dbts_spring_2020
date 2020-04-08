package org.dbts.repository;

import org.dbts.model.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("taskRepository")
public class HibernateTaskRepository implements TaskRepository {

    @Value("${wsDatabaseURL}")
    private String wsDatabaseURL;

    @Override
    public List<Task> findAll() {

        System.out.println(wsDatabaseURL);

        List<Task> tasks = new ArrayList<>();
        Task task = new Task();
        task.setName("Task name one");
        task.setDescription("Task description one");

        tasks.add(task);

        return tasks;
    }
}
