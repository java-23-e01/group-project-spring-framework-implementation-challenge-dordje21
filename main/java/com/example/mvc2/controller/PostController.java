package com.example.mvc2.controller;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {
    @PostMapping(value = "/post", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<String> indexPost(@RequestPart("name") String name, @RequestPart("number") String num, @RequestPart("email") String email) {
        // Process the form data and file upload here
        List<String> list = Arrays.asList(name, num, email);
        System.out.println(list);

        return list;
    }
}
