package flyweight.enums;

import flyweight.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 4/15/2019.
 */
public enum Company {
    AMD("Advanced Micro Devices", 1),
    APPLE("Apple", 2),
    ASUS("Asus", 3),
    CANON("Canon", 4),
    COOLERMASTER("Cooler Master", 5),
    DELL("Dell", 6),
    FUJITSU("Fujitsu", 7),
    HP("Hewlett-Packard", 8),
    HUAWEI("Huawei", 9),
    IBM("IBM", 10),
    INTEL("Intel", 11),
    KINGSTON("Kingston", 12),
    LENOVO("Lenovo", 13),
    LG("LG Electronics", 14),
    LOGITECH("Logitech", 15),
    NIKON("Nikon", 16),
    NVIDIA("Nvidia", 17),
    PHILIPS("Philips", 18),
    RIOT("Riot", 19),
    SAMSUNG("Samsung", 20),
    SANDISK("SanDisk", 21),
    SONY("Sony", 22),
    TOSHIBA("Toshiba", 23),
    WD("Western Digital", 24),
    XIAOMI("Xiaomi", 25);

    private String name;
    private int id;

    private Company(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Company fromId(int id) {
        if (id > 0 && id < 26)
            for (Company company : values()) {
                if (company.getId() == id) {
                    return company;
                }
            }
        throw new NotValidValueException(Company.class, "The id (" + id + ") is not valid");
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
