package br.com.marvel.Comics.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/comics")
@RestController
@Slf4j
public class ComicsController {

    @GetMapping
    public void listComics() {
        log.debug("Listou comics!");
    }

}
