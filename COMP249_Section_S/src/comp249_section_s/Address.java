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

    public Address(Address otherAddress) {
        this(otherAddress.streetNumber, otherAddress.streetName, otherAddress.cityName);
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
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }

        // DO NOT USE instanceof operator in equals method. NEVER NEVER
        //if (!(otherObject instanceof Address))
        //    return false;
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        Address otherAddress = (Address) otherObject;

        return this.streetNumber == otherAddress.streetNumber
                && this.streetName.equals(otherAddress.streetName)
                && this.cityName.equals(otherAddress.cityName);

    }
// toString

    public String toString() {
        return this.streetNumber + " " + this.streetName() + ", " + this.cityName;
    }
}
