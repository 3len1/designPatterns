package strategy.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * Created by 3len1 on 2/7/2019.
 */
public class DateUtils {

    private static final String CREDIT_CARD_EXPIRY_DATE_PATTERN = "MM/yyyy";

    public static Instant getInstantFromString(String ym) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.parseDefaulting(ChronoField.DAY_OF_MONTH, 1);
        builder.append(DateTimeFormatter.ofPattern(CREDIT_CARD_EXPIRY_DATE_PATTERN));
        DateTimeFormatter dtf = builder.toFormatter();
        LocalDate date = LocalDate.parse(ym, dtf);
        return Instant.from(date.atStartOfDay().toInstant(ZoneOffset.UTC));
    }

    public static String getStringFromInstant(Instant date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CREDIT_CARD_EXPIRY_DATE_PATTERN);
        return simpleDateFormat.format(Date.from(date));
    }
}
