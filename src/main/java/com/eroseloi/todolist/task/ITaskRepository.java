package com.eroseloi.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    //Filtro para listar as task por usuário
    List<TaskModel> findByIdUser(UUID idUser);
}
