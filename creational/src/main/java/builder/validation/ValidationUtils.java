package builder.validation;


import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class ValidationUtils {

    public static <T> T validate(Object value, String field, boolean required, Integer maxLength) {
        return (T) validate(value, field, required, maxLength, Optional.empty());
    }

    public static <T> T validate(Object value, String field, boolean required, Integer maxLength, Optional<String> regex) {
        if (StringUtils.isEmpty(value)) {
            if (required)
                throw new ValidationExceptions(field, "is required!!");
        } else {
            if (maxLength != null && value.toString().length() > maxLength)
                throw new ValidationExceptions(field, "Length of " + value.toString() + " is greater than " + maxLength + "!");
            if (regex.isPresent()) {
                Pattern pattern = Pattern.compile(regex.get());
                Matcher matcher = pattern.matcher(value.toString());
                if (!matcher.matches())
                    throw new ValidationExceptions(field, value.toString() + " is not valid!");
            }
        }
        return (T) value;
    }
}
