package br.com.marvel.Comics.clients;

import br.com.marvel.Comics.clients.dto.comics.ComicsDTO;

public interface MarvelClient {

    DataDTO<ComicsDTO> listComics();

}
