package br.com.marvel.comics.clients.dto.characters;

import lombok.Data;

@Data
public class CharacterDataWrapper {

    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHtml;
    private CharacterDataContainer data;
    private String etag;

}
