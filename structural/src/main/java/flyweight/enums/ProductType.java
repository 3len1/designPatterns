package flyweight.enums;

/**
 * Created by 3len1 on 4/15/2019.
 */
public enum ProductType {
    BACKPACK("Backpack"),
    CAMERA("Camera"),
    CASE("Case"),
    COOLER("Cooler"),
    CPU("CPU"),
    GPU("Graphic Card"),
    HEADSET("Headset"),
    HHD("HHD"),
    KEYBOARD("Keyboard"),
    LAPTOP("Laptop"),
    MICROPHONE("Microphone"),
    MONITOR("Monitor"),
    MOTHERBOARD("Motherboard"),
    MOUSE("Mouse"),
    PC("Personal computer"),
    PRINTER("Printer"),
    PROCESSOR("Processor"),
    RAM("RAM"),
    SMARTPHONE("Smartphone"),
    SPEAKERS("Speakers"),
    SSD("SSD"),
    TABLET("Tablet"),
    USB("USB");

    private String name;

    private ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
