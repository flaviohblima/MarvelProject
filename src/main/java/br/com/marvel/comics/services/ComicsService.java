package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.DataDTO;
import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.comics.ComicsDTO;
import org.springframework.stereotype.Service;

@Service
public class ComicsService {

    private final MarvelClient client;

    public ComicsService(MarvelClient client) {
        this.client = client;
    }

    public DataDTO<ComicsDTO> listComics() {
        return client.listComics();
    }

}
