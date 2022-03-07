package FootballBetting.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Continents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @OneToMany
    private Set<Countries> countries;

    public Continents(String name) {
        this.name = name;
    }

    public Continents() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Countries> getCountries() {
        return countries;
    }

    public void setCountries(Set<Countries> countries) {
        this.countries = countries;
    }
}
