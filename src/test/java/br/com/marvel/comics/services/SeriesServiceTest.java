package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SeriesServiceTest {

    @InjectMocks
    private SeriesService service;

    @Mock
    private MarvelClient client;

    @Test
    void listSeries() {
        SeriesDataWrapper expected = new SeriesDataWrapper();
        when(client.listSeries()).thenReturn(expected);
        SeriesDataWrapper actual = service.listSeries();
        assertEquals(expected, actual);
    }
}