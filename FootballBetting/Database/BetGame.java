package FootballBetting.Database;

import FootballBetting.Database.embeddedIds.BetGamePK;

import javax.persistence.*;

@Entity
@Table
public class BetGame {

    @EmbeddedId
    private BetGamePK pk;
    @ManyToOne
    private ResultPrediction resultPrediction;

    public BetGame(Games game, Bets bet, ResultPrediction resultPrediction) {
    pk.setGame(game);
    pk.setBet(bet);
        this.resultPrediction = resultPrediction;
    }

    public BetGame() {
    }

    public Games getGame() {
        return pk.getGame();
    }

    public void setGame(Games game) {
        this.pk.setGame(game);
    }

    public Bets getBet() {
        return pk.getBet();
    }

    public void setBet(Bets bet) {
        this.pk.setBet(bet);
    }

    public ResultPrediction getResultPrediction() {
        return resultPrediction;
    }

    public void setResultPrediction(ResultPrediction resultPrediction) {
        this.resultPrediction = resultPrediction;
    }
}
