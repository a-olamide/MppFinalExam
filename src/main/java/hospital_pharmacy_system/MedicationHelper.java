package hospital_pharmacy_system;

import java.util.ArrayList;
import java.util.List;

public class MedicationHelper<T> {

    List<T> medications = new ArrayList<>();

    public void printMedicationNames(List<? extends T> medicationnames) {
        for(T medication : medicationnames){
            System.out.println(medication);
        }
    }
    public void addPainKillers(List<? extends T> painkillers) {
        medications.addAll(painkillers);
    }


}
