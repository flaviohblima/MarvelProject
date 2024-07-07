package br.com.marvel.Comics.controllers;

import br.com.marvel.Comics.clients.DataDTO;
import br.com.marvel.Comics.clients.dto.comics.ComicsDTO;
import br.com.marvel.Comics.services.ComicsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/comics")
@RestController
@Slf4j
public class ComicsController {

    @Autowired
    ComicsService service;

    @GetMapping
    public ResponseEntity<DataDTO<ComicsDTO>> listComics() {
        DataDTO<ComicsDTO> dataDTO = service.listComics();
        return new ResponseEntity<>(dataDTO, HttpStatus.OK);
    }

}
