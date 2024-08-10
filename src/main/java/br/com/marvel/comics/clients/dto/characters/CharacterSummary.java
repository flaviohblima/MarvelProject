package br.com.marvel.comics.clients.dto.characters;

import lombok.Data;

@Data
public class CharacterSummary {

    private String resourceURI;
    private String name;
    private String role;

}
