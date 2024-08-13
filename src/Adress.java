public class Adress {
    private static String postalCode;
    private static String adress;
    private static String number;

    public Adress(String postalCode, String adress, String number) {
        this.postalCode = postalCode;
        this.adress = adress;
        this.number = number;
    }

    public static String getPostalCode() {
        return postalCode;
    }

    public static void setPostalCode(String postalCode) {
        Adress.postalCode = postalCode;
    }

    public static String getAdress() {
        return adress;
    }

    public static void setAdress(String adress) {
        Adress.adress = adress;
    }

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String number) {
        Adress.number = number;
    }
}
