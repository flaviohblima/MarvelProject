
package br.com.marvel.Comics.clients.dto.comics;

import lombok.Data;

import java.util.List;

@Data
public class Creators {

    private Long available;
    private String collectionURI;
    private List<CreatorsItem> items;
    private Long returned;

}
