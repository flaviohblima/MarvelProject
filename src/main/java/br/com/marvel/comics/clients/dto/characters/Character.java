package br.com.marvel.comics.clients.dto.characters;

import br.com.marvel.comics.clients.dto.comics.ComicList;
import br.com.marvel.comics.clients.dto.commons.Image;
import br.com.marvel.comics.clients.dto.events.EventList;
import br.com.marvel.comics.clients.dto.series.SeriesList;
import br.com.marvel.comics.clients.dto.stories.StoryList;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Character {

    private int id;
    private String name;
    private String description;
    private ZonedDateTime modified;
    private String resourceURI;

    private Image thumbnail;

    private ComicList comics;
    private StoryList stories;
    private EventList events;
    private SeriesList series;

}
