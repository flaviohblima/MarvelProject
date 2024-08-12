package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ComicsServiceTest {

    @InjectMocks
    private ComicsService service;

    @Mock
    private MarvelClient client;

    @Test
    void listComics() {
        ComicDataWrapper expected = new ComicDataWrapper();
        when(client.listComics()).thenReturn(expected);
        ComicDataWrapper actual = service.listComics();
        assertEquals(expected, actual);
    }

}