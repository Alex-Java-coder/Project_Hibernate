package domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
@Getter
@Setter
@ToString(exclude = {"capital", "languages"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Country {

    @Id
    @Column(name = "Code")
    @EqualsAndHashCode.Include
    private String code;


    @Column(name = "Code2")
    private String alternativeCode;

    @Column(name = "Name")
    private String name;


    @Column(name = "Continent")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private BigDecimal surfaceArea;

    @Column(name = "IndepYear")
    private Short independenceYear;

    @Column(name = "Population")
    private Integer population;

    @Column(name = "LifeExpectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "GNP")
    private BigDecimal gnp;

    @Column(name = "GNPOld")
    private BigDecimal gnpOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Capital")
    private City capital;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<CountryLanguage> languages = new HashSet<>();
}