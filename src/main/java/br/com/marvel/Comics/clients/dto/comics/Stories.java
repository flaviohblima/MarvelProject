
package br.com.marvel.Comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class Stories {

    private Long available;
    private String collectionURI;
    private List<StoriesItem> items;
    private Long returned;

}
