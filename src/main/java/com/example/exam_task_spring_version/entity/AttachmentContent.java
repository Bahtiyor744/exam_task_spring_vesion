package com.example.exam_task_spring_version.entity;

import com.example.exam_task_spring_version.base.BaseEntity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AttachmentContent extends BaseEntity {
    private byte[] photo;
}
