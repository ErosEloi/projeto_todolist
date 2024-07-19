package com.eroseloi.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_Tasks")
public class TaskModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String descripition;

    @Column(length = 50)
    private String Title;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

    private String priority;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private UUID idUser;


}
