package br.com.marvel.comics.controllers;

import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import br.com.marvel.comics.services.SeriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SeriesController {

    private final SeriesService service;

    public SeriesController(SeriesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<SeriesDataWrapper> listSeries() {
        SeriesDataWrapper series = service.listSeries();
        return new ResponseEntity<>(series, HttpStatus.OK);
    }

}
