package pl.thadacz.sportradar.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Competitor {
    private String id;
    private String name;
    private String country;
    @Column(name = "country_code")
    private String countryCode;
    private String abbreviation;
    private String qualifier;
    private String gender;

    @Override
    public String toString() {
        return name + " (" + country + ')';
    }
}