
package br.com.marvel.Comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class Events {

    private Long available;
    private String collectionURI;
    private List<Object> items;
    private Long returned;

}
