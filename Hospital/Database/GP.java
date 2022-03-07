package Hospital.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class GP {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String fName;
    @Column
    private String lName;
    @OneToMany
    @JoinColumn(name = "patients_ids",referencedColumnName = "id")
    private Set<Patient> patients;

    public GP() {
    }

    public GP(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}
