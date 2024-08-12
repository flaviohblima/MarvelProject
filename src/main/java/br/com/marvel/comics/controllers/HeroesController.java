package br.com.marvel.comics.controllers;

import br.com.marvel.comics.clients.dto.characters.CharacterDataWrapper;
import br.com.marvel.comics.services.HeroesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/heroes")
@RestController
@Slf4j
public class HeroesController {

    private final HeroesService service;

    public HeroesController(HeroesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<CharacterDataWrapper> listHeroes() {
        CharacterDataWrapper heroes = service.listHeroes();
        return new ResponseEntity<>(heroes, HttpStatus.OK);
    }

}
