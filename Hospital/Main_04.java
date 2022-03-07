package Hospital;

import Hospital.Database.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.Collections;

public class Main_04 {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("HibernateCodeFirst");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Patient patient = new Patient("name","lastName","address","email", LocalDateTime.now(),true);
        Diagnosis diagnosis = new Diagnosis("diagnosis","comment");
        Visitation visitation = new Visitation(LocalDateTime.now(),"visitation");
        Medicaments medicaments = new Medicaments("Paracetamol");
        GP gp = new GP("The","Gp");
        patient.setDiagnoses(Collections.singleton(diagnosis));
        patient.setVisitations(Collections.singleton(visitation));
        patient.setMedicaments(Collections.singleton(medicaments));
        gp.setPatients(Collections.singleton(patient));

        entityManager.persist(patient);
        entityManager.persist(diagnosis);
        entityManager.persist(visitation);
        entityManager.persist(medicaments);
        entityManager.persist(gp);


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
