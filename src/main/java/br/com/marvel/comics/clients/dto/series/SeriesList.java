package br.com.marvel.comics.clients.dto.series;

import lombok.Data;

import java.util.List;

@Data
public class SeriesList {

    private int available;
    private int returned;
    private String collectionURI;
    private List<SeriesSummary> items;

}
