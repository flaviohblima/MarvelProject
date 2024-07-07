package br.com.marvel.Comics.clients;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private DataDTO<T> data;

}
