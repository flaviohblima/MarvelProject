package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicsDTO;

public interface MarvelClient {

    br.com.marvel.comics.clients.DataDTO<ComicsDTO> listComics();

}
