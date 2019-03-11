package bridge.utils;

import bridge.enums.Label;
import bridge.exceptions.NotFound;
import bridge.objects.Info;

import java.util.List;

/**
 * Created by 3len1 on 3/10/2019.
 */
public class InfoUtils {

    public static Info searchByLabel(List<Info> details, Label label) {
        return details.stream().filter(i -> i.getLabel() == label).findFirst()
                .orElseThrow(() -> new NotFound(label));
    }
}
