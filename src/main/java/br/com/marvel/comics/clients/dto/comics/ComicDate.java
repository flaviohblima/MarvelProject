package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ComicDate {

    private String type;
    private ZonedDateTime date;

}
