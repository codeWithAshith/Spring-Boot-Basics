package com.codeWithAshith.SpringBootBasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookSController {

    @GetMapping("/books")
    public List<Book> getAllbooks() {
        return Arrays.asList(new Book(1, "Spring boot", "Code With Ashith"),
                new Book(1, "Spring boot 2", "Code With Ashith 2"));
    }
}
