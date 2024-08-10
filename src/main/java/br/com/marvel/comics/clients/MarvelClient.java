package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;

public interface MarvelClient {

    ComicDataWrapper listComics();
    SeriesDataWrapper listSeries();

}
