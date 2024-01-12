package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;


    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    private void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        return Objects.equals(this.getCity(), ((Address) o).getCity()) &&
                Objects.equals(this.getCity(), ((Address) o).getStreet()) &&
                Objects.equals(this.getCity(), ((Address) o).getZipcode());

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getCity(), this.getStreet(), this.getZipcode());
    }


}
