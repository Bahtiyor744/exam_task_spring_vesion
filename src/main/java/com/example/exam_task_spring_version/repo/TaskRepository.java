package com.example.exam_task_spring_version.repo;

import com.example.exam_task_spring_version.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}