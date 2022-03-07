package FootballBetting.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Rounds {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @OneToMany
    Set<Games> games;

    public Rounds() {}

    public Rounds(String name) {
        this.name = name;
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

    public Set<Games> getGames() {
        return games;
    }

    public void setGames(Set<Games> games) {
        this.games = games;
    }
}
