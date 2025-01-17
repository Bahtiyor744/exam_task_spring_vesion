package com.example.exam_task_spring_version.controller;

import com.example.exam_task_spring_version.entity.Columns;
import com.example.exam_task_spring_version.repo.ColumnsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/columns")
public class ColumnsController {

    private final ColumnsRepository columnsRepository;


    @PostMapping("/add")
    public String addColumn(
            @RequestParam String title,
            @RequestParam Integer orderNumber,
            @RequestParam(required = false) boolean isCompleted
    ) {
        columnsRepository.save(new Columns(title, isCompleted, orderNumber));
        return "redirect:/";
    }


}
