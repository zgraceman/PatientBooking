public class Clinic {

    // Fields
    int clinicId;
    String name;

    public Clinic(int clinicId, String name) {
        this.clinicId = clinicId;
        this.name = name;
    }

    public Clinic() {
    }

    public int getClinicId() {
        return clinicId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "clinicId=" + clinicId +
                ", name='" + name + '\'' +
                '}';
    }
}
