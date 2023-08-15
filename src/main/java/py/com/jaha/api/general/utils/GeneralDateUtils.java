package py.com.jaha.api.general.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import io.vavr.control.Try;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import py.com.bbva.api.apicommon.helper.RepositoryHelper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GeneralDateUtils {

    public static String formatTime(String time) {
        String timeStr = time;

        if (time != null && !time.contains(":")) {
            timeStr = String
                    .format("%-8s", time)
                    .replace(" ", "0");
            timeStr = timeStr.replaceFirst("([01]\\d|2[0123])([012345]\\d)([012345]\\d)?([012345]\\d)?", "$1:$2:$3.$4");
        }

        return timeStr;


    }

    public static LocalDateTime getLocalDateTime(java.sql.Date sqlDate, String time) {
        String dateStr = new SimpleDateFormat("ddMMyyyy").format(sqlDate);
        String timeStr = formatTime(time);
        LocalDateTime dateTime = RepositoryHelper.getLocalDateTime(dateStr, timeStr);

        return dateTime;
    }

    public static String formatLocalDatetime(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
    
    public static String formatDate(String dateFormat, String dateString) {
    	return Try.of(() -> {
    		Date date = new SimpleDateFormat("yyyyMMdd").parse(dateString);
        	SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
    		return formatter.format(date);
    	}).get();    	
    }
}
