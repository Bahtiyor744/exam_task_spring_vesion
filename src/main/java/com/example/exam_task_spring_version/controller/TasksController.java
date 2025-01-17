package com.example.exam_task_spring_version.controller;

import com.example.exam_task_spring_version.entity.Columns;
import com.example.exam_task_spring_version.repo.ColumnsRepository;
import com.example.exam_task_spring_version.repo.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TasksController {

    private final TaskRepository taskRepository;

    @PostMapping("/add")
    public String addColumn(
            @RequestParam String title,
            @RequestParam Integer orderNumber,
            @RequestParam(required = false) boolean isCompleted
    ) {
//        taskRepository.save(new Columns(title, isCompleted, orderNumber));
        return "redirect:/";
    }


}
