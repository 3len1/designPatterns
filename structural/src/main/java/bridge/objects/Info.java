package bridge.objects;

import bridge.enums.Label;
import lombok.*;

/**
 * Created by 3len1 on 2/14/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private Label label;
    private String value;
}
