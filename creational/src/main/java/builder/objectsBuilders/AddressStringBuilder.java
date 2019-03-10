package builder.objectsBuilders;

import java.util.Scanner;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class AddressStringBuilder {

    public static String getAddressStringBuilder() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter country: ");
        String country = scanner.nextLine();
        System.out.println("Enter town: ");
        String town = scanner.nextLine();
        System.out.println("Enter street: ");
        String street = scanner.nextLine();
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Enter zip code: ");
        int zipcode = scanner.nextInt();

        StringBuilder address = new StringBuilder();

        address.append(country).append(", ")
                .append(zipcode).append(" - ")
                .append(town).append(", ")
                .append(street).append(" ")
                .append(number);

        return address.toString();
    }
}
