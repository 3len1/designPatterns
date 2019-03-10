package bridge.formatters;

import bridge.objects.Info;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
public interface Formatter {
    String format(String subject, String body, List<Info> details);
}
