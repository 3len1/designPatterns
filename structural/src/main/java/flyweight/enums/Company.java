package flyweight.enums;

/**
 * Created by 3len1 on 4/15/2019.
 */
public enum Company {
    AMD("Advanced Micro Devices"),
    APPLE("Apple"),
    ASUS("Asus"),
    CANON("Canon"),
    COOLERMASTER("Cooler Master"),
    DELL("Dell"),
    FUJITSU("Fujitsu"),
    HP("Hewlett-Packard"),
    HUAWEI("Huawei"),
    IBM("IBM"),
    INTEL("Intel"),
    KINGSTON("Kingston"),
    LENOVO("Lenovo"),
    LG("LG Electronics"),
    LOGITECH("Logitech"),
    NIKON("Nikon"),
    NVIDIA("Nvidia"),
    PHILIPS("Philips"),
    RIOT("Riot"),
    SAMSUNG("Samsung"),
    SANDISK("SanDisk"),
    SONY("Sony"),
    TOSHIBA("Toshiba"),
    WD("Western Digital"),
    XIAOMI("Xiaomi");

    private String name;

    private Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
