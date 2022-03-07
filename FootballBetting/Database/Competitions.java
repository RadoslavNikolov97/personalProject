package FootballBetting.Database;

import FootballBetting.Database.Enums.CompetitionTypes;

import javax.persistence.*;

@Entity
@Table
public class Competitions {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private CompetitionTypes competitionTypes;

    public Competitions(String name, CompetitionTypes competitionTypes) {
        this.name = name;
        this.competitionTypes = competitionTypes;
    }

    public Competitions() {

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

    public CompetitionTypes getCompetitionTypes() {
        return competitionTypes;
    }

    public void setCompetitionTypes(CompetitionTypes competitionTypes) {
        this.competitionTypes = competitionTypes;
    }
}
