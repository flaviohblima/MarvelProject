package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {

    public SeriesDataWrapper listSeries() {
        return new SeriesDataWrapper();
    }
}
