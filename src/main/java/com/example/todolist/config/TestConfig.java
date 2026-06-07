package com.example.todolist.config;

import com.example.todolist.entities.ToDoList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<ToDoList> list = new ArrayList<>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ToDoList s1 = new ToDoList(null, "洗濯物", Instant.now());
        ToDoList s2 = new ToDoList(null, "プロジェクト提出", Instant.now(), LocalDate.parse("10/06/2026", fmt));
        ToDoList s3 = new ToDoList(null, "買い物", Instant.now());
        ToDoList s4 = new ToDoList(null, "勉強", Instant.now(), LocalDate.parse("13/06/2026", fmt));
        ToDoList s5 = new ToDoList(null, "寝る", Instant.now());


        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

    }
}
