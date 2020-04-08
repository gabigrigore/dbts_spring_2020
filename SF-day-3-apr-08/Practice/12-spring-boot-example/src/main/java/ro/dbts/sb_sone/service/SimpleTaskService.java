package ro.dbts.sb_sone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.dbts.sb_sone.model.Task;
import ro.dbts.sb_sone.repository.TaskRepository;

import java.util.List;

@Service("taskService")
public class SimpleTaskService implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findFirstById(int id) {
        return taskRepository.findFirstById(id);
    }

    @Override
    public void removeTask(int id) {
        taskRepository.removeTask(id);
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }
}
