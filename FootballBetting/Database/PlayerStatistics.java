package FootballBetting.Database;

import FootballBetting.Database.embeddedIds.PlayerStatisticsPK;

import javax.persistence.*;
import java.sql.Time;
@Entity
@Table
public class PlayerStatistics {
    @EmbeddedId
    private PlayerStatisticsPK pk;
    @Column
    private int scoredGoals;
    @Column
    private int playerAssists;
    @Column
    private Time playedMinutesDuringGame;

    public PlayerStatistics(Games game, Players player, int scoredGoals, int playerAssists, Time playedMinutesDuringGame) {
        this.pk.setGame(game);
        this.pk.setPlayer(player);
        this.scoredGoals = scoredGoals;
        this.playerAssists = playerAssists;
        this.playedMinutesDuringGame = playedMinutesDuringGame;
    }

    public PlayerStatistics() {
    }

    public Games getGame() {
        return pk.getGame();
    }

    public void setGame(Games game) {
        this.pk.setGame(game);
    }

    public Players getPlayer() {
        return pk.getPlayer();
    }

    public void setPlayer(Players player) {
        this.pk.setPlayer(player);
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public int getPlayerAssists() {
        return playerAssists;
    }

    public void setPlayerAssists(int playerAssists) {
        this.playerAssists = playerAssists;
    }

    public Time getPlayedMinutesDuringGame() {
        return playedMinutesDuringGame;
    }

    public void setPlayedMinutesDuringGame(Time playedMinutesDuringGame) {
        this.playedMinutesDuringGame = playedMinutesDuringGame;
    }
}
