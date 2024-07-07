package br.com.marvel.Comics.services;

import br.com.marvel.Comics.clients.DataDTO;
import br.com.marvel.Comics.clients.MarvelClient;
import br.com.marvel.Comics.clients.dto.comics.ComicsDTO;
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
