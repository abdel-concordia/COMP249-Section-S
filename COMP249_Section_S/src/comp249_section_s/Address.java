package comp249_section_s;

public class Address {

    // Street number
    private int streetNumber;
    //Street name
    private String streetName;
    // City name
    private String cityName;

    public Address(int streetNumber, String streetName, String cityName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
    }

    // Getters
    public int getStreetNumber() {
        return this.streetNumber;
    }

    public String streetName() {
        return this.streetName;
    }

    public String getCityName() {
        return this.cityName;
    }

    //Setters
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    //equals
    public boolean equals(Address otherAddress) {
        if (otherAddress == null) {
            return false;
        }
        return this.streetNumber == otherAddress.streetNumber
                && this.streetName.equals(otherAddress.streetName)
                && this.cityName.equals(otherAddress.cityName);

    }
// toString

    public String toString() {
        return this.streetNumber + " " + this.streetName() + ", " + this.cityName;
    }
}
