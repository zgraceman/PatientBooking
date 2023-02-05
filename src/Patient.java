public class Patient {

    // Fields
    private int patientId;
    private String patientName;

    // Constructor
    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    // toString


    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    // Methods
    public void bookAppointment(Doctor doctor, Clinic clinic) {

        System.out.println(this.patientName + " booked appointment with " +
                doctor.getName() + " at " + clinic.getName());

    }

}
