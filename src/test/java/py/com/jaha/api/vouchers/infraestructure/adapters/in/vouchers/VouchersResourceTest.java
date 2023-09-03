package py.com.jaha.api.vouchers.infraestructure.adapters.in.vouchers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static py.com.jaha.api.vouchers.constants.GlobalConstants.API_BASE;
import static py.com.jaha.api.vouchers.constants.GlobalConstants.API_VERSION_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersResponse;
import py.com.jaha.api.vouchers.domain.ports.in.GetVouchersPort;
import py.com.jaha.api.vouchers.infraestructure.adapters.config.GetVouchersUseCaseConfig;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@ImportAutoConfiguration(value = {
    RefreshAutoConfiguration.class,
    GetVouchersUseCaseConfig.class
})
@WebMvcTest(VouchersResource.class)
public class VouchersResourceTest {

    private final String VOUCHERS_BASE_URL = "/" + API_BASE + "/vouchers/" + API_VERSION_1;
    private final String VOUCHERS_ALL_URL = VOUCHERS_BASE_URL + "/vouchers";

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GetVouchersPort getVouchersUseCase;

    @Test
    public void getVouchersByCountryAndSate_success() throws Exception{
        HttpHeaders httpHeaders = new HttpHeaders();

        when(getVouchersUseCase.execute(any())).thenReturn(buildGetVouchersResponse());

        MockHttpServletResponse response = mvc.perform(get(VOUCHERS_ALL_URL)
                .param("countryCode","586")
                .param("stateCode","11")
                .accept(MediaType.APPLICATION_JSON)
                .headers(httpHeaders)
        ).andReturn().getResponse();
        
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }

    @Test
    public void getVouchersByCountry_success() throws Exception{
        HttpHeaders httpHeaders = new HttpHeaders();

        when(getVouchersUseCase.execute(any())).thenReturn(buildGetVouchersResponse());

        MockHttpServletResponse response = mvc.perform(get(VOUCHERS_ALL_URL)
                .param("countryCode","586")
                .accept(MediaType.APPLICATION_JSON)
                .headers(httpHeaders)
        ).andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }

    private GetVouchersResponse buildGetVouchersResponse() {
        return GetVouchersResponse.builder().build();
    }
}