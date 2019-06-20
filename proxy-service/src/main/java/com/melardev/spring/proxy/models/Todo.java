package com.melardev.spring.proxy.models;

import java.time.LocalDateTime;

public class Todo {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private boolean completed;

    public Long getId() {
        return id;
    }

    public Todo() {
    }

    public Todo(Long id, String title, String description, Boolean completed, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Todo(String title, String description) {
        this(title, description, false);
    }

    public Todo(String title, String description, boolean completed) {
        this(null, title, description, completed, null, null);
    }

    public Todo(Long id, String title, boolean completed, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this(id, title, null, completed, createdAt, updatedAt);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}