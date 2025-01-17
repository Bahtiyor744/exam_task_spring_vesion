package com.example.exam_task_spring_version.entity;
import com.example.exam_task_spring_version.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users extends BaseEntity {
    private String phone;
    private String password;
    private String firstName;
    private  String lastName;
    private Integer age;
    @OneToOne
    private AttachmentContent attachmentContent;
}
