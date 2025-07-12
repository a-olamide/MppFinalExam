package hospital_billing_system;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);
    default void printDetailedBill(String patientId, double amount) {
        System.out.println(formatDetailedBill(patientId, amount));
    }
    private String formatDetailedBill(String patientId, double amount) {
        return String.format("Hospital Bill for patient %s: %.2f processed", patientId, amount);
    }
    static boolean validateInsuranceId(String insuranceId) {
        return insuranceId.matches("^[a-zA-Z0-9]{10}$");
    }
    static boolean validatePatientId(String patientId) {
        return patientId.startsWith("HSP") && patientId.length() ==8;
    }

}
