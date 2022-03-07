package FootballBetting.Database.embeddedIds;

import FootballBetting.Database.Games;
import FootballBetting.Database.Players;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class PlayerStatisticsPK implements Serializable {

    @ManyToOne
    private Games game;

    @ManyToOne
    private Players player;

    public PlayerStatisticsPK(Games game, Players player) {
        this.game = game;
        this.player = player;
    }

    public PlayerStatisticsPK() {
    }

    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }
}
