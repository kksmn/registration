package com.boots.service.impl;

import com.boots.entity.Task;
import com.boots.repository.TaskRepository;
import com.boots.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Override
    public Task addTask(Task task) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Task getByName(String name) {
        return null;
    }

    @Override
    public Task editBank(Task task) {
        return null;
    }

    @Override
    public List<Task> getAll(int id) {
        return taskRepository.getAllTasks(id);
    }

    @Override
    public List<Task> sortTasks() {
        return null;
    }
}
