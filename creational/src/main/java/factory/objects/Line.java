package factory.objects;

import lombok.*;

/**
 * Created by 3len1 on 1/29/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Line {
    private Point start;
    private Point end;
    private double length;
}
