
package br.com.marvel.Comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class ComicsDTO {

    private Long id;
    private Long digitalId;
    private String title;
    private Long issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private Long pageCount;
    private List<Object> textObjects;
    private String resourceURI;
    private List<Url> urls;
    private Series series;
    private List<Variant> variants;
    private List<Object> collections;
    private List<Object> collectedIssues;
    private List<Date> dates;
    private List<Price> prices;
    private Thumbnail thumbnail;
    private List<Object> images;
    private Creators creators;
    private Characters characters;
    private Stories stories;
    private Events events;

}
