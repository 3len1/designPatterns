package flyweight.objects;

import flyweight.enums.Company;
import flyweight.enums.ProductType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by 3len1 on 4/15/2019.
 */
public class Registry {
    private static final Logger LOGGER = LoggerFactory.getLogger(Registry.class);
    private Map<String, Product> products = new HashMap<>();

    public Product lookup(String productName) {
        if (!products.containsKey(productName))
            products.put(productName, createProduct(productName));
        return products.get(productName);
    }

    public int totalProductsMade() {
        return products.size();
    }

    private Product createProduct(String name) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.debug("Create new product with name {}.", name);
        Product product = new Product(name);
        System.out.println("Companies [" + Arrays.asList(Company.values()) + "]");
        System.out.println("Enter company id and press enter");
        product.setCompany(Company.fromId(scanner.nextInt()));
        scanner.nextLine();
        System.out.println("Product types [" + Arrays.asList(ProductType.values()) + "]");
        System.out.println("Enter product type id and press enter");
        product.setProductType(ProductType.fromId(scanner.nextInt()));
        scanner.nextLine();
        System.out.println("Enter description:");
        product.setDescription(scanner.nextLine());
        return product;
    }

    public List<Product> getAllProducts() {
        return products.values().stream().collect(Collectors.toList());
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append("Retested products\n_________________________________________\n");
        products.values().forEach(product ->
                builder.append(product.simplePrint() + "\n")
        );
        return builder.toString();
    }

}
