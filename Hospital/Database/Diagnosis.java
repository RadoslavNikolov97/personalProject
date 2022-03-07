package Hospital.Database;

import javax.persistence.*;

@Entity
@Table
public class Diagnosis {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (nullable = false)
    private String name;
    @Column
    private  String comment;

    public Diagnosis() {
    }

    public Diagnosis(String name, String comment) {
        this.name = name;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
