package py.com.jaha.api.general;

import java.net.InetAddress;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;
import py.com.bbva.api.apiaudit.ApiAuditApplication;
import py.com.bbva.api.apicommon.ApiCommonApplication;
import py.com.bbva.api.apicommon.constants.GlobalConstants;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Import({ApiCommonApplication.class, ApiAuditApplication.class})
@RefreshScope
@EnableAspectJAutoProxy()
@EnableAsync
@EnableFeignClients
@Slf4j
public class GeneralApplication {

    public static void main(String[] args) {

        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            System.setProperty(GlobalConstants.HOST_IP_NAME, hostAddress);
        } catch (Exception e) {
            log.error("No se pudo obtener la ip para el hostIp attr");
        }
        SpringApplication.run(GeneralApplication.class, args);
    }

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Asuncion"));
        Locale.setDefault(Locale.forLanguageTag("es_PY"));
    }

    //aca ya todos los beans estan cargados
    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        log.info("Ya se inicio el Api de Servicios Generales");
    }

}
