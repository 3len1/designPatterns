package visitor.enums;

/**
 * Created by 3len1 on 2/11/2019.
 */
public enum Category {
    REGULAR("carnivore"),
    VEGETARIAN("vegetarian"),
    VEGAN("vegan");

    private String description;

    private Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
