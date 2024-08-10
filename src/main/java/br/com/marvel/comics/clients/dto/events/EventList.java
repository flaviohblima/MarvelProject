package br.com.marvel.comics.clients.dto.events;

import lombok.Data;

import java.util.List;

@Data
public class EventList {

    private int available;
    private int returned;
    private String collectionURI;
    private List<EventSummary> items;

}
