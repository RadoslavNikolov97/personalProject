package Hospital.Database;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table
public class Patient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String fName;
    @Column(nullable = false)
    private String lName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private LocalDateTime dateOfBirth;
    @Column(nullable = false)
    private boolean medicalInsurance;
    @OneToMany
    private Set<Visitation> visitations;
    @OneToMany
    private Set<Diagnosis> diagnoses;
    @ManyToMany
    private Set<Medicaments> medicaments;

    public Patient() {
    }

    public Patient(String fName, String lName, String address, String email, LocalDateTime dateOfBirth, boolean medicalInsurance) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.medicalInsurance = medicalInsurance;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(boolean medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public Set<Visitation> getVisitations() {
        return visitations;
    }

    public void setVisitations(Set<Visitation> visitations) {
        this.visitations = visitations;
    }

    public Set<Diagnosis> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public Set<Medicaments> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicaments> medicaments) {
        this.medicaments = medicaments;
    }
}
