package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
public class MarvelClientImpl implements MarvelClient {

    private final String publicKey;
    private final String privateKey;
    private final RestTemplate restTemplate;
    private String marvelGateway = "http://gateway.marvel.com/v1/public";

    public MarvelClientImpl(@Value("${comics.public-key}") String publicKey,
                            @Value("${comics.private-key}") String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.restTemplate = new RestTemplate();
    }

    public ComicDataWrapper listComics() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String ts = formatter.format(new Date());
        String hash = createEncryptedHash(ts);

        // /comics?ts=1&apikey=1234&hash=ffd275c5130566a2916217b101f26150
        String endpoint = marvelGateway +
                "/comics" +
                "?ts=" + ts +
                "&apikey=" + publicKey +
                "&hash=" + hash;

        ResponseEntity<ComicDataWrapper> response = restTemplate.exchange(
                endpoint,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                ComicDataWrapper.class
        );

        return response.getBody();
    }

    protected String createEncryptedHash(String ts) {
        String password = ts + privateKey + publicKey;
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }

}
