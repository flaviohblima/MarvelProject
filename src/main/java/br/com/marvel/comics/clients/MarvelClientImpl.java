package br.com.marvel.comics.clients;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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

    public MarvelClientImpl(@Value("${comics.public-key}") String publicKey,
                            @Value("${comics.private-key}") String privateKey,
                            RestTemplate restTemplate) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.restTemplate = restTemplate;
    }

    public ComicDataWrapper listComics() {
        String url = buildGetComicsUrl();
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                ComicDataWrapper.class
        ).getBody();
    }

    protected String buildGetComicsUrl() {
        String ts = formatTimestamp(new Date());
        String hash = createEncryptedHash(ts);
        String marvelGateway = "http://gateway.marvel.com/v1/public";
        return marvelGateway + "/comics?ts=" + ts + "&apikey=" + publicKey + "&hash=" + hash;
    }

    protected String formatTimestamp(Date seedDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        return formatter.format(seedDate);
    }

    protected String createEncryptedHash(String ts) {
        String password = ts + privateKey + publicKey;
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }

}
