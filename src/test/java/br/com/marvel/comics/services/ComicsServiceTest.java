package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ComicsServiceTest {

    @InjectMocks
    private ComicsService service;

    @Mock
    private MarvelClient client;

    @Test
    void listComics() {
        service.listComics();
        verify(client, times(1)).listComics();
    }

}