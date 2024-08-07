package br.com.marvel.comics.clients;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
class MarvelClientTest {

    @Mock
    private RestTemplate restTemplate;

    @Test
    void createEncryptedHash() {
        // arrange > objetos
        String expected = "ffd275c5130566a2916217b101f26150";
        String publicKey = "1234";
        String privateKey = "abcd";
        String ts = "1";

        MarvelClientImpl client = new MarvelClientImpl(publicKey, privateKey, restTemplate);

        // act > chama o método
        String actual = client.createEncryptedHash(ts);

        // assert > assegura que deu certo
        Assertions.assertEquals(expected, actual);
    }

}