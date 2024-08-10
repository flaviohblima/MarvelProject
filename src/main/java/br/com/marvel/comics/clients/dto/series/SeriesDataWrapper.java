package br.com.marvel.comics.clients.dto.series;

import br.com.marvel.comics.clients.dto.comics.ComicDataContainer;
import lombok.Data;

@Data
public class SeriesDataWrapper {

    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHtml;
    private SeriesDataContainer data;
    private String etag;

}
