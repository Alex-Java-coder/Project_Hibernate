package domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "world", name = "city")
@Getter
@Setter
public class City {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", length = 35)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Column(name = "District", length = 20)
    private String district;

    @Column(name = "Population")
    private Integer population;
}