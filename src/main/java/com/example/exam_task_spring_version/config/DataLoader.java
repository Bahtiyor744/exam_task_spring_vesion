package com.example.exam_task_spring_version.config;

import com.example.exam_task_spring_version.entity.AttachmentContent;
import com.example.exam_task_spring_version.entity.Users;
import com.example.exam_task_spring_version.repo.AttachmentContentRepository;
import com.example.exam_task_spring_version.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddlAuto;
    private final UsersRepository usersRepository;
    private final AttachmentContentRepository attachmentContentRepository;

    @Override
    public void run(String... args) {
//        System.out.println(ddlAuto);
        if (ddlAuto.equals("create")){
            AttachmentContent attachmentContent1 = new AttachmentContent();
            AttachmentContent attachmentContent2 = new AttachmentContent();
            AttachmentContent attachmentContent3 = new AttachmentContent();
            attachmentContentRepository.save(attachmentContent1);
            attachmentContentRepository.save(attachmentContent2);
            attachmentContentRepository.save(attachmentContent3);
            Users user1 = new Users
                    ("1","1","Admin1", "Hakerov",1,attachmentContent1);
            Users user2 = new Users
                    ("2","2","Admin2", "Hakerov",1,attachmentContent2);
            Users user3 = new Users
                    ("3","3","Admin3", "Hakerov",1,attachmentContent3);
            usersRepository.save(user1);
            usersRepository.save(user2);
            usersRepository.save(user3);
        }

    }
}
