package br.com.marvel.comics.controllers;

import br.com.marvel.comics.clients.dto.comics.ComicDataWrapper;
import br.com.marvel.comics.services.ComicsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class ComicsControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ComicsService service;

    @Autowired
    private JacksonTester<ComicDataWrapper> comicDataWrapperJson;

    @Test
    void listComics() throws Exception {
        ComicDataWrapper expected = new ComicDataWrapper();
        when(service.listComics()).thenReturn(expected);

        MockHttpServletResponse response = mvc
                .perform(get("/comics"))
                .andReturn()
                .getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

        String expectedJson = comicDataWrapperJson.write(expected).getJson();
        assertThat(response.getContentAsString()).isEqualTo(expectedJson);
    }

}