import java.util.ArrayList;

class PatientManager {
    ArrayList<Patient> patients;

    public PatientManager() {
        patients = new ArrayList<>(10);
    }

    public int addPatient(Patient patient) {
        patients.add(patient);
        return patients.size() - 1;
    }

    public Patient removePatient(int index) {
        return patients.remove(index);
    }

    public void caffeineAbsorption() {
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            patient.caffeineLevel -= 130;
            if (patient.getCaffeineLevel() <= 0) {
                patients.remove(i);
                i--; // Adjust index since we removed an element
            }
        }
    }

    @Override
    public String toString() {
        if (patients.isEmpty()) {
            return "Empty";
        } else {
            StringBuilder result = new StringBuilder();
            for (Patient patient : patients) {
                result.append(patient.toString()).append("\n");
            }
            return result.toString().trim();
        }
    }
}
