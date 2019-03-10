package prototype.objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@Setter
@NoArgsConstructor
public class Technology extends Product {
    private String model;
    private String description;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Technology{" +
                "model='" + model + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n" + super.toString();
    }
}
