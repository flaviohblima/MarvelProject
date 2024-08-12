package br.com.marvel.comics.services;

import br.com.marvel.comics.clients.MarvelClient;
import br.com.marvel.comics.clients.dto.characters.CharacterDataWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HeroesServiceTest {

    @InjectMocks
    private HeroesService service;

    @Mock
    private MarvelClient client;

    @Test
    void listHeroes() {
        CharacterDataWrapper expected = new CharacterDataWrapper();
        when(client.listHeroes()).thenReturn(expected);
        CharacterDataWrapper actual = service.listHeroes();
        assertEquals(expected, actual);
    }

}