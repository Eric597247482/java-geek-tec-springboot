package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author Eric
 * @Date 2019/12/29 0029
 **/
@Data
@Component
@PropertySource("classpath:book.properties")
public class Book {
    @Value("${book.id}")
    private String id;

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

}
