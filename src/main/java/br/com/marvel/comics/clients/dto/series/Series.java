package br.com.marvel.comics.clients.dto.series;

import br.com.marvel.comics.clients.dto.characters.CharacterList;
import br.com.marvel.comics.clients.dto.comics.*;
import br.com.marvel.comics.clients.dto.commons.Image;
import br.com.marvel.comics.clients.dto.commons.Url;
import br.com.marvel.comics.clients.dto.creators.CreatorList;
import br.com.marvel.comics.clients.dto.events.EventList;
import br.com.marvel.comics.clients.dto.stories.StoryList;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Series {

    private int id;
    private String title;
    private String description;
    private String resourceURI;
    private List<Url> urls;
    private int startYear;
    private int endYear;
    private String rating;
    private ZonedDateTime modified;
    private Image thumbnail;

    private ComicList comics;
    private StoryList stories;
    private EventList events;
    private CharacterList characters;
    private CreatorList creators;

    private SeriesSummary next;
    private SeriesSummary previous;


}
