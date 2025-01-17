package com.example.exam_task_spring_version.controller;

import com.example.exam_task_spring_version.entity.Columns;
import com.example.exam_task_spring_version.repo.ColumnsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PageController {

    private final ColumnsRepository columnsRepository;

    @GetMapping
    public String indexPage(
            Model model
    ) {
        List<Columns> columns = columnsRepository.findAll();
        model.addAttribute("columns", columns);
        return "tasks";
    }

}
