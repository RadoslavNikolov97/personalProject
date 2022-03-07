package FootballBetting.Database;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table
public class Games {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Teams homeTeam;
    @ManyToOne
    private Teams awayTeam;
    @Column
    private int homeGoals;
    @Column
    private int awayGoals;
    @Column
    private LocalDateTime dateAndTime;
    @Column
    private double homeBetRate;
    @Column
    private double awayBetRate;
    @Column
    private double drawBetRate;
    @ManyToOne
    private Rounds round;
    @ManyToOne
    private Competitions competition;

    public Games() {
    }

    public Games(Teams homeTeam, Teams awayTeam,
                 int homeGoals, int awayGoals,
                 LocalDateTime dateAndTime, double homeBetRate,
                 double awayBetRate, double drawBetRate, Rounds round,
                 Competitions competition) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.dateAndTime = dateAndTime;
        this.homeBetRate = homeBetRate;
        this.awayBetRate = awayBetRate;
        this.drawBetRate = drawBetRate;
        this.round = round;
        this.competition = competition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teams getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Teams homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Teams getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Teams awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getHomeBetRate() {
        return homeBetRate;
    }

    public void setHomeBetRate(double homeBetRate) {
        this.homeBetRate = homeBetRate;
    }

    public double getAwayBetRate() {
        return awayBetRate;
    }

    public void setAwayBetRate(double awayBetRate) {
        this.awayBetRate = awayBetRate;
    }

    public double getDrawBetRate() {
        return drawBetRate;
    }

    public void setDrawBetRate(double drawBetRate) {
        this.drawBetRate = drawBetRate;
    }

    public Rounds getRound() {
        return round;
    }

    public void setRound(Rounds round) {
        this.round = round;
    }

    public Competitions getCompetition() {
        return competition;
    }

    public void setCompetition(Competitions competition) {
        this.competition = competition;
    }
}
