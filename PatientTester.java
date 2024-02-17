public class PatientTester {
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();
        System.out.println(manager); // Print Empty
        
        manager.addPatient(new Patient(1, 200));
        manager.addPatient(new Patient(2, 400));
        manager.addPatient(new Patient(3, 600));
        manager.addPatient(new Patient(4, 800));
        System.out.println(manager); // Print patients
        
        manager.caffeineAbsorption();
        manager.caffeineAbsorption();
        System.out.println(manager); // Print updated patients after caffeine absorption
        
        // Removing patient with the highest caffeine level
        int highestCaffeineIndex = 0;
        for (int i = 1; i < manager.patients.size(); i++) {
            if (manager.patients.get(i).getCaffeineLevel() > manager.patients.get(highestCaffeineIndex).getCaffeineLevel()) {
                highestCaffeineIndex = i;
            }
        }
        manager.removePatient(highestCaffeineIndex);
        System.out.println(manager); // Print updated patients after removing the patient with highest caffeine
    }
}
