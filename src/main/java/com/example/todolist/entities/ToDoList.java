package com.example.todolist.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_todolist")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Instant currentTime;
    private LocalDate dueDate;

    public ToDoList(){

    }

    public ToDoList(Long id, String content, Instant currentTime) {
        this.id = id;
        this.content = content;
        this.currentTime = currentTime;
    }

    public ToDoList(Long id, String content, Instant currentTime, LocalDate dueDate) {
        this.id = id;
        this.content = content;
        this.currentTime = currentTime;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Instant currentTime) {
        this.currentTime = currentTime;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ToDoList toDoList = (ToDoList) o;
        return Objects.equals(getId(), toDoList.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "toDoList{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", currentTime=" + currentTime +
                ", dueDate=" + dueDate +
                '}';
    }
}
