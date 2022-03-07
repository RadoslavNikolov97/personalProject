package Hospital.Database;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Visitation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "date",nullable = false)
    private LocalDateTime date;
    @Column (name = "comment")
    private String comment;


    public Visitation() {
    }

    public Visitation(LocalDateTime date, String comment) {
        this.date = date;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
