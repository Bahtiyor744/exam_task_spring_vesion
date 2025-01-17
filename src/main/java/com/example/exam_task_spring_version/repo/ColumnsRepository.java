package com.example.exam_task_spring_version.repo;

import com.example.exam_task_spring_version.entity.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumnsRepository extends JpaRepository<Columns, Integer> {
}