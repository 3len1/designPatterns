package flyweight.objects;

import flyweight.enums.Company;
import flyweight.enums.ProductType;
import lombok.*;

/**
 * Created by 3len1 on 4/15/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private ProductType productType;
    private Company company;
    private String description;

    public Product(String name) {
        this.name = name;
    }

    public String print() {
        return "name: " + name +
                "\ncompany: " + company.getName() +
                "\ntype: " + productType.getName() +
                "\ndescription: " + description + "\n";
    }

    public String simplePrint() {
        return "Product: " + company.getName() + " " + name;
    }
}
