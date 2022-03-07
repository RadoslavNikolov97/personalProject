package FootballBetting.Database;

import javax.persistence.*;

@Entity
@Table
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @ManyToOne
    private Continents continents;

    public Countries(String name, Continents continents) {
        this.name = name;
        this.continents = continents;
    }

    public Countries() {
    }

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

    public Continents getContinents() {
        return continents;
    }

    public void setContinents(Continents continents) {
        this.continents = continents;
    }
}
