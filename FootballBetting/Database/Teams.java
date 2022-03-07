package FootballBetting.Database;

import com.mysql.cj.jdbc.Blob;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
public class Teams {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column  //TODO - find a way to implement a picture
    private String logo;
    @Column(length = 3)
    private String initials;
    @ManyToOne
    private Colors primaryColor;
    @ManyToOne
    private Colors secondaryColor;
    @ManyToOne
    private Towns town;

    @OneToMany
    private Set<Players> players;

    @Column
    private BigDecimal budget;

    public Teams() {
    }

    public Teams(String name, String logo, String initials, Colors primaryColor, Colors secondaryColor, Towns town, BigDecimal budget) {
        this.name = name;
        this.logo = logo;
        this.initials = initials;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.town = town;
        this.budget = budget;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Colors getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(Colors primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Colors getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(Colors secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Towns getTown() {
        return town;
    }

    public void setTown(Towns town) {
        this.town = town;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Set<Players> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Players> players) {
        this.players = players;
    }
}
