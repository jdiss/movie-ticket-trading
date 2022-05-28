package com.jd.movieticketstrading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/movie")
public class MovieController
{
    @GetMapping(path="/tickets")
    public String get()
    {
        return "Hello World";
    }
}
