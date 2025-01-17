package com.example.exam_task_spring_version.repo;


import com.example.exam_task_spring_version.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}