package adapter.objects;

import adapter.enums.Color;
import adapter.enums.Element;
import adapter.enums.Level;
import lombok.*;

import java.util.List;

/**
 * Created by 3len1 on 2/12/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Craft {
    private String tittle;
    private String description;
    private List<Element> elements;
    private List<Color> colors;

    private Level level;
}
