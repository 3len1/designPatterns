package templateMethod.enums;

import java.util.Random;

/**
 * Created by 3len1 on 2/5/2019.
 */
public enum Name {
    FRITZ_RAGLAND,
    ELVIRA_WASH,
    MARCELINE_DELAND,
    ELVIN_BILLINGS,
    JERICA_MCGILLIS,
    BRIANNA_NULL,
    FRANCES_DIMOND,
    SHERYL_KUMP,
    LORELEI_ENZ,
    MADLYN_HIPPLE,
    HERMINE_NASS,
    BLAIR_BARRET,
    MORRIS_IDDINGS,
    RAUL_LITCHFORD,
    MELINDA_MEMMOTT,
    LEONARD_SOILEAU,
    NOEL_REZENTES,
    ANGIE_ROST,
    HARVEY_SWOPE,
    JUSTINA_SINIARD,
    LOUETTA_MATER,
    HULDA_VALENCIA,
    RICARDA_ROUSSEAU,
    RONA_PATTY,
    SOLEDAD_NUSBAUM,
    TEQUILA_HUNTSBERRY,
    DORIA_MCNICHOLS,
    DONTE_CASELLA,
    BERNIECE_SIEMERS,
    NGOC_REAUX;

    public static Name getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
