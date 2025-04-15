package com.example.todo_api.hw;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class MyRepository {

    public void repositoryMethod() {
        System.out.println("repository");
    }
}
