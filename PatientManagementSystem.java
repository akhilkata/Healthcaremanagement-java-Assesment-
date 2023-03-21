import java.util.ArrayList;
import java.util.List;

public class PatientManagementSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;

    public PatientManagementSystem() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
