package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TodoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo=new Todo("fishing",4, 1);
        repository.save(todo);

        todo=new Todo("cooking",8, 2);
        repository.save(todo);

        todo=new Todo("sport",42, 3);
        repository.save(todo);
    }
}
