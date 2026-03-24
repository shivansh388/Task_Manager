package com.example.Task_Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.Task_Manager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUsername(String username);
}