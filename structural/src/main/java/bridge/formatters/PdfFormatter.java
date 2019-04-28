package bridge.formatters;


import bridge.enums.Label;
import bridge.objects.Info;
import bridge.utils.InfoUtils;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
public class PdfFormatter implements Formatter {

    @Override
    public String format(String subject, String body, List<Info> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("Subject:\n");
        builder.append(subject + "\n");
        builder.append("_________________________________\n");
        builder.append("From : " + InfoUtils.searchByLabel(details, Label.SENDER).getValue() + "\n");
        builder.append("To : " + InfoUtils.searchByLabel(details, Label.RECEIVER).getValue() + "\n");
        builder.append("Body:\n");
        builder.append(body + "\n");
        builder.append(InfoUtils.searchByLabel(details, Label.SIGNATURE).getValue());
        builder.append("\n");
        return builder.toString();
    }
}
