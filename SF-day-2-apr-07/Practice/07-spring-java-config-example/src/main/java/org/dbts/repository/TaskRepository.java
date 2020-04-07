package org.dbts.repository;

import org.dbts.model.Task;

import java.util.List;

public interface TaskRepository {

    List<Task> findAll();
}
