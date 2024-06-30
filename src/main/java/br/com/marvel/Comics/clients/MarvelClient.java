package br.com.marvel.Comics.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class MarvelClient {

    private final String publicKey;
    private final String privateKey;
    private final RestTemplate restTemplate;

    public MarvelClient(@Value("app.public-key") String publicKey,
                        @Value("app.private-key") String privateKey,
                        @Autowired RestTemplate restTemplate) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.restTemplate = restTemplate;
    }

    private String marvelGateway = "http://gateway.marvel.com/v1/public";

    protected String createEncryptedHash(String ts) {
        String password = ts + privateKey + publicKey;
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }

//    public void listComics() {
//        Timstamp ts = new Timestamp();
//        String hash = createEncryptedHash(ts);
//        restTemplate.exchange(
//                marvelGateway + "/comics",
//                HttpMethod.GET,
//                null,
//
//        );
//    }


}
