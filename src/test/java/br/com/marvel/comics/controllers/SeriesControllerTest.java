package br.com.marvel.comics.controllers;

import br.com.marvel.comics.clients.dto.series.SeriesDataWrapper;
import br.com.marvel.comics.services.SeriesService;
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
class SeriesControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SeriesService service;

    @Autowired
    private JacksonTester<SeriesDataWrapper> seriesDataWrapperJson;

    @Test
    void listSeries() throws Exception {
        SeriesDataWrapper expected = new SeriesDataWrapper();
        when(service.listSeries()).thenReturn(expected);

        MockHttpServletResponse response = mvc
                .perform(get("/series"))
                .andReturn()
                .getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

        String expectedJson = seriesDataWrapperJson.write(expected).getJson();
        assertThat(response.getContentAsString()).isEqualTo(expectedJson);
    }

}