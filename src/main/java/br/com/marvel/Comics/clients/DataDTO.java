package br.com.marvel.Comics.clients;

import lombok.Data;

import java.util.List;

@Data
public class DataDTO<T> {

    private Integer offset;
    private Integer limit;
    private Integer total;
    private Integer count;

    private List<T> results;

}
