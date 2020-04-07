package org.dbts.service;

import org.dbts.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
}
