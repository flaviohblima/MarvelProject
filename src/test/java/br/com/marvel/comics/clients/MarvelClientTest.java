package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MarvelClientTest {

    @Mock
    private RestTemplate restTemplate;

    @Test
    void listComics() {
        MarvelClientImpl client = spy(new MarvelClientImpl("publicKey", "privateKey", restTemplate));
        when(client.buildGetUrl("comics")).thenReturn("mockedUrl");

        ComicDataWrapper expected = mock(ComicDataWrapper.class);
        ResponseEntity<ComicDataWrapper> expectedResponse = new ResponseEntity<>(expected, HttpStatus.OK);
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), eq(HttpEntity.EMPTY), eq(ComicDataWrapper.class)))
                .thenReturn(expectedResponse);

        ComicDataWrapper actual = client.listComics();

        assertEquals(expected, actual);
    }

    @Test
    void listSeries() {
        MarvelClientImpl client = spy(new MarvelClientImpl("publicKey", "privateKey", restTemplate));
        when(client.buildGetUrl("series")).thenReturn("mockedUrl");

        SeriesDataWrapper expected = mock(SeriesDataWrapper.class);
        ResponseEntity<SeriesDataWrapper> expectedResponse = new ResponseEntity<>(expected, HttpStatus.OK);
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), eq(HttpEntity.EMPTY), eq(SeriesDataWrapper.class)))
                .thenReturn(expectedResponse);

        SeriesDataWrapper actual = client.listSeries();

        assertEquals(expected, actual);
    }

    @Test
    void buildGetUrl() {
        MarvelClientImpl client = spy(new MarvelClientImpl("publicKey", "privateKey", restTemplate));
        when(client.getAuthParameters()).thenReturn("ts=timestamp&apikey=publicKey&hash=someHash");
        String expected = "http://gateway.marvel.com/v1/public/comics?ts=timestamp&apikey=publicKey&hash=someHash";

        String actual = client.buildGetUrl("comics");
        assertEquals(expected, actual);
    }

    @Test
    void formatTimestamp() throws ParseException {
        MarvelClientImpl client = spy(new MarvelClientImpl("publicKey", "privateKey", restTemplate));

        String expected = "2000-01-02_01-02-03";
        Date parsedDate = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")
                .parse(expected);

        String actual = client.formatTimestamp(parsedDate);

        assertEquals(expected, actual);
    }


    @Test
    void createEncryptedHash() {
        MarvelClientImpl client = new MarvelClientImpl("1234", "abcd", restTemplate);
        String ts = "1";
        String actual = client.createEncryptedHash(ts);
        assertEquals("ffd275c5130566a2916217b101f26150", actual);
    }

}