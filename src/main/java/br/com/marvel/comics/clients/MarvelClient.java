package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;

public interface MarvelClient {

    ComicDataWrapper listComics();

}
