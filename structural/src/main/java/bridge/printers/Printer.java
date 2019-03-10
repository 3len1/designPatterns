package bridge.printers;

import bridge.formatters.Formatter;
import bridge.objects.Info;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getSubject(), getBody(), getDetails());
    }

    abstract protected List<Info> getDetails();

    abstract protected String getSubject();

    abstract protected String getBody();

}
