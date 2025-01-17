package com.example.exam_task_spring_version.entity;

import com.example.exam_task_spring_version.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends BaseEntity {
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate deadline;
    @ManyToMany
    private List<Users> users;

}
