package templateMethod.objects;

import lombok.*;

/**
 * Created by 3len1 on 2/4/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {

    private int age;
    private String name;

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }

        if (this.age < o.age) {
            return -1;
        }

        return 0;
    }

}
