package Hospital.Database;

import javax.persistence.*;

@Entity
@Table
public class Medicaments {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (nullable = false)
    private String name;

    public Medicaments() {
    }

    public Medicaments(String name) {
        this.name = name;
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
}
