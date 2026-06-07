package com.example.todolist.controller;


import com.example.todolist.entities.ToDoList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    private List<ToDoList> list = new ArrayList<>();

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    list.add(new ToDoList (null, "プロジェクト提出", Instant.now(), LocalDate.parse("10/06/2026", fmt));

    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);

    @GetMapping
    public ResponseEntity<List<ToDoList>> getAllList(){

        return ResponseEntity.ok().body(list) ;
    }

}
