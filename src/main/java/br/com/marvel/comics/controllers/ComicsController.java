package br.com.marvel.comics.controllers;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import br.com.marvel.comics.services.ComicsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/comics")
@RestController
@Slf4j
public class ComicsController {

    private final ComicsService service;

    public ComicsController(ComicsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ComicDataWrapper> listComics() {
        ComicDataWrapper comicData = service.listComics();
        return new ResponseEntity<>(comicData, HttpStatus.OK);
    }

}
