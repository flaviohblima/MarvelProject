package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.characters.CharacterDataWrapper;
import org.springframework.stereotype.Service;

@Service
public class HeroesService {

    private final MarvelClient client;

    public HeroesService(MarvelClient client) {
        this.client = client;
    }

    public CharacterDataWrapper listHeroes() {
        return client.listHeroes();
    }

}
