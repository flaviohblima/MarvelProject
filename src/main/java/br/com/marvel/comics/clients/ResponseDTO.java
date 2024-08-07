package br.com.marvel.comics.clients;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private DataDTO<T> data;

}
