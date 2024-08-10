package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class ComicList {

    private int available;
    private int returned;
    private String collectionURI;
    private List<ComicSummary> items;

}
