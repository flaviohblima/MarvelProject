package br.com.marvel.Comics.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/movies")
@RestController
@Slf4j
public class MoviesController {

    @GetMapping
    public void listMovies() {
        log.debug("Listou movies!");
    }

}
