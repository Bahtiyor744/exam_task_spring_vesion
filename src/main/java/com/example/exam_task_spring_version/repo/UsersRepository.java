package com.example.exam_task_spring_version.repo;

import com.example.exam_task_spring_version.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}