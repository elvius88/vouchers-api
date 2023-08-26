package py.com.jaha.api.general.infraestructure.adapters.in.cities;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static py.com.jaha.api.general.constants.GlobalConstants.API_BASE;
import static py.com.jaha.api.general.constants.GlobalConstants.API_VERSION_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import py.com.jaha.api.general.domain.ports.in.GetCitiesPort;
import py.com.jaha.api.general.domain.usecases.cities.GetCitiesUseCase;
import py.com.jaha.api.general.infraestructure.adapters.config.GetCitiesUseCaseConfig;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@ImportAutoConfiguration(value = {
    RefreshAutoConfiguration.class,
    GetCitiesUseCaseConfig.class
})
@WebMvcTest(CityResource.class)
public class CityResourceTest {

    private final String CITIES_BASE_URL= "/" + API_BASE + "/general/" + API_VERSION_1 + "/cities";

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GetCitiesPort getCitiesUseCase;

    @TestConfiguration
    static class BeforeInitialize{
        @Bean
        public GetCitiesPort getCitiesUseCase(){
            return new GetCitiesUseCase();
        }

    }

    @Test
    public void getCitiesByCountriesAndDepartment_success() throws Exception{
        HttpHeaders httpHeaders = new HttpHeaders();

        MockHttpServletResponse response = mvc.perform(get(CITIES_BASE_URL)
                .param("countryCode","586")
                .param("departmentCode","11")
                .accept(MediaType.APPLICATION_JSON)
                .headers(httpHeaders)
        ).andReturn().getResponse();
        String body=response.getContentAsString();
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }

    @Test
    public void getCitiesByCountry_success() throws Exception{
        HttpHeaders httpHeaders = new HttpHeaders();

        MockHttpServletResponse response = mvc.perform(get(CITIES_BASE_URL)
                .param("countryCode","586")
                .accept(MediaType.APPLICATION_JSON)
                .headers(httpHeaders)
        ).andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }
}