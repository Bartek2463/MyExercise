package Stream;

public class Adres {
    String zipCode;
    String town;

    public Adres(String zipCode, String town, String street) {
        this.zipCode = zipCode;
        this.town = town;
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    String street;


}
