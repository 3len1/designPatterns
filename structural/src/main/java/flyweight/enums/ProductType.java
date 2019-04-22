package flyweight.enums;

import flyweight.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 4/15/2019.
 */
public enum ProductType {
    BACKPACK("Backpack", 1),
    CAMERA("Camera", 2),
    CASE("Case", 3),
    COOLER("Cooler", 4),
    CPU("CPU", 5),
    GPU("Graphic Card", 6),
    HEADSET("Headset", 7),
    HHD("HHD", 8),
    KEYBOARD("Keyboard", 9),
    LAPTOP("Laptop", 10),
    MICROPHONE("Microphone", 11),
    MONITOR("Monitor", 12),
    MOTHERBOARD("Motherboard", 13),
    MOUSE("Mouse", 14),
    PC("Personal computer", 15),
    PRINTER("Printer", 16),
    PROCESSOR("Processor", 17),
    RAM("RAM", 18),
    SMARTPHONE("Smartphone", 19),
    SPEAKERS("Speakers", 20),
    SSD("SSD", 21),
    TABLET("Tablet", 22),
    USB("USB", 23);

    private String name;
    private int id;

    private ProductType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static ProductType fromId(int id) {
        if (id > 0 && id < 24)
            for (ProductType type : values()) {
                if (type.getId() == id) {
                    return type;
                }
            }
        throw new NotValidValueException(ProductType.class, "The id (" + id + ") is not valid");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() +
                "(" + id + ")";
    }

}
