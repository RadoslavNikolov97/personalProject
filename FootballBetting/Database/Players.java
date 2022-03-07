package FootballBetting.Database;


import javax.persistence.*;

@Entity
@Table
public class Players {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int teamNumber;
    @ManyToOne
    private Teams team;
    @ManyToOne
    private Position position;
    @Column
    private boolean isInjured;

    public Players(String name, int teamNumber, Teams team, Position position, boolean isInjured) {
        this.name = name;
        this.teamNumber = teamNumber;
        this.team = team;
        this.position = position;
        this.isInjured = isInjured;
    }

    public Players() {
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

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }
}
