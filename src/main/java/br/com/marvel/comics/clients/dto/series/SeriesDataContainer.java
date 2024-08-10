package br.com.marvel.comics.clients.dto.series;

import lombok.Data;

import java.util.List;

@Data
public class SeriesDataContainer {

    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Series> results;

}
