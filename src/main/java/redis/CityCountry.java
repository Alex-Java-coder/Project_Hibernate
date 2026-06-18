package redis;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class CityCountry {
    private Integer id;
    private String name;
    private Integer population;
    private String district;

    private String countryCode;
    private String alternativeCountryCode;
    private String countryName;
    private Integer countryPopulation;
    private String countryRegion;
    private BigDecimal countrySurfaceArea;
    private String continent;

    private Set<Language> languages;
}