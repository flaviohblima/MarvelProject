
package br.com.marvel.comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class Stories {

    private Long available;
    private String collectionURI;
    private List<StoriesItem> items;
    private Long returned;

}
