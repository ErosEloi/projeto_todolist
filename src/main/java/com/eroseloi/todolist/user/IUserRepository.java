package com.eroseloi.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{

    //Metodo para procurar por username - criado "manualmente"
   UserModel findByUsername(String username);
    
} 
