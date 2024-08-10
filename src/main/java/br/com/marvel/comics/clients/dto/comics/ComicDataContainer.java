package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class ComicDataContainer {

    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Comic> results;

}
