package FootballBetting.Database.embeddedIds;

import FootballBetting.Database.Bets;
import FootballBetting.Database.Games;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class BetGamePK implements Serializable {
    @ManyToOne
    private Games game;
    @ManyToOne
    private Bets bet;

    public BetGamePK(Games game, Bets bet) {
        this.game = game;
        this.bet = bet;
    }

    public BetGamePK() {
    }

    public Games getGame() {
        return game;
    }

    public Bets getBet() {
        return bet;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    public void setBet(Bets bet) {
        this.bet = bet;
    }
}
