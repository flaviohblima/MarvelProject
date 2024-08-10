package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import org.springframework.stereotype.Service;

@Service
public class ComicsService {

    private final MarvelClient client;

    public ComicsService(MarvelClient client) {
        this.client = client;
    }

    public ComicDataWrapper listComics() {
        return client.listComics();
    }

}
