package address;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonAutoDetect
public class Address {
    @JsonProperty("Країна")     // for JacksonParser
    @SerializedName("Країна")   // for GsonParser
    private String country;
    @JsonProperty("місто")     // for JacksonParser
    @SerializedName("місто")   // for GsonParser
    private String city;
    @JsonProperty("вулиця")     // for JacksonParser
    @SerializedName("вулиця")   // for GsonParser
    private String street;

    public Address() {
    }

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
