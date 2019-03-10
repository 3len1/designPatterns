package prototype.objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import prototype.enums.GameType;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@Setter
@NoArgsConstructor
public class Game extends Product {
    private String tittle;
    private GameType type;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Game{" +
                "tittle='" + tittle + '\'' +
                ", type=" + type +
                '}' + "\n" + super.toString();
    }
}
