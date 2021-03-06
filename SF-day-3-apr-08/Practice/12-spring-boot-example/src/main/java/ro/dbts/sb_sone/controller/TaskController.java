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

    @GetMapping("/add")
    @ResponseBody
    public void addTask(@RequestParam("id") int id,
                        @RequestParam("name") String name,
                        @RequestParam("desc") String description) {
        taskService.addTask(new Task(id, name, description));
    }


    @GetMapping("/remove/{id}")
    @ResponseBody
    public void removeTask(@PathVariable(value = "id") int id) {
        taskService.removeTask(id);
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "listall";
    }

    @GetMapping("/findFirstById/{id}")
    @ResponseBody
    public Task getById(@PathVariable(value = "id") int id) {
        return taskService.findFirstById(id);
    }
}
