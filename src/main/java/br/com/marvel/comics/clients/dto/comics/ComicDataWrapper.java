package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

@Data
public class ComicDataWrapper {

    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHtml;
    private ComicDataContainer data;
    private String etag;

}
