package bridge.formatters;

import bridge.objects.Info;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
public class EmailFormatter implements Formatter {
    @Override
    public String format(String subject, String body, List<Info> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(subject);
        builder.append("\n");



        return builder.toString();
    }
}
