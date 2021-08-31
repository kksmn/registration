package com.boots.service;

import com.boots.entity.Task;

import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    void delete(long id);
    Task getByName(String name);
    Task editBank(Task task);
    List<Task> getAll(int id);
    List<Task> sortTasks();
}
