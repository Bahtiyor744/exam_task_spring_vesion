package com.example.exam_task_spring_version.entity;

import com.example.exam_task_spring_version.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Columns extends BaseEntity {
    private String title;
    private Boolean is_completed = false;
    private Integer orders;

}
