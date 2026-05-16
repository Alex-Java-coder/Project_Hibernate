package domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "countrylanguage")
@Getter
@Setter
@ToString(exclude = {"country"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Column(name = "IsOfficial")
    private Boolean official;

    @Column(name = "Percentage")
    private BigDecimal percentage;
}