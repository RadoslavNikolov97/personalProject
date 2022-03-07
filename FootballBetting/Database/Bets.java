package FootballBetting.Database;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table
public class Bets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private BigDecimal bet_money;
    @Column
    private LocalDateTime date;

    @ManyToOne
    private Users user;

    public Bets(BigDecimal bet_money, LocalDateTime date) {
        this.bet_money = bet_money;
        this.date = date;
    }

    public Bets() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getBet_money() {
        return bet_money;
    }

    public void setBet_money(BigDecimal bet_money) {
        this.bet_money = bet_money;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
