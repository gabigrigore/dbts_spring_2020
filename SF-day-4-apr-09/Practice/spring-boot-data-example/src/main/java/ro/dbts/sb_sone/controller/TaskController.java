package ro.dbts.sb_sone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.dbts.sb_sone.model.Task;
import ro.dbts.sb_sone.service.TaskService;

import java.util.List;

@Controller
@RequestMapping("/v1")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "listall";
    }

    @PostMapping("/add")
    @ResponseBody
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PatchMapping("/update/{id}")
    @ResponseBody
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/remove/{id}")
    @ResponseBody
    public Task removeTask(@PathVariable(value = "id") Long id) {
        return taskService.removeTask(id);
    }



    @GetMapping("/findFirstById/{id}")
    @ResponseBody
    public Task getById(@PathVariable(value = "id") Long id) {
        return taskService.findFirstById(id);
    }
}
