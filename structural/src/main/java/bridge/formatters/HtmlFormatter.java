package bridge.formatters;

import bridge.objects.Info;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
public class HtmlFormatter implements Formatter {


    @Override
    public String format(String subject, String body, List<Info> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Message");
        builder.append("</th>");
        builder.append("<th><b>");
        builder.append(subject);
        builder.append("</b></th>");

        for (Info detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }
        builder.append("<tr>");
        builder.append(body);
        builder.append("</tr>");
        builder.append("</table>");

        return builder.toString();
    }
}
