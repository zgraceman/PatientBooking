public class Doctor {

    // Fields
    int doctorId;
    String name;

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    public Doctor() {
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                '}';
    }
}
