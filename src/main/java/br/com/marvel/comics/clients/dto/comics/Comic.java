package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Comic {

    private int id;
    private int digitalid;
    private String title;
    private double issueNumber;
    private String variantDescription;
    private String description;

    private ZonedDateTime modified;

    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private int pageCount;
    private List<TextObject> textObjects;
    private String resourceURI;
    private List<Url> urls;
    private SeriesSummary series;
    private List<ComicSummary> variants;
    private List<ComicSummary> collections;
    private List<ComicSummary> collectedIssues;
    private List<ComicDate> dates;
    private List<ComicPrice> prices;
    private Image thumbnail;
    private List<Image> images;
    private CreatorList creators;
    private CharacterList characters;
    private StoryList stories;
    private EventList events;

}
