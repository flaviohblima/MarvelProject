package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicsDTO;

public interface MarvelClient {

    DataDTO<ComicsDTO> listComics();

}
