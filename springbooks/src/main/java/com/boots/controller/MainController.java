package com.boots.controller;


import com.boots.entity.Task;
import com.boots.service.impl.TaskServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private TaskServiceImpl taskService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }
    @RequestMapping(value = "/getTasks", method = RequestMethod.GET)
    public String getTasks(Model model) {
        List<Task> tasks=taskService.getAll(1);
        model.addAttribute("tasks",tasks);
        return "tasks";
    }


}