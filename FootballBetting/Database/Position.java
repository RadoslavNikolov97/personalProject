package FootballBetting.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Position {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 2)
    private String position;
    @Column
    private String positionDescription;
    @OneToMany
    private Set<Players> players;

    public Position(String position, String positionDescription) {
        this.position = position;
        this.positionDescription = positionDescription;
    }

    public Position() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public Set<Players> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Players> players) {
        this.players = players;
    }
}
