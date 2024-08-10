package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {

    private final MarvelClient client;

    public SeriesService(MarvelClient client) {
        this.client = client;
    }

    public SeriesDataWrapper listSeries() {
        return client.listSeries();
    }
}
