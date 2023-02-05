public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Jeff");
        Doctor d1 = new Doctor(1, "Bill");
        Clinic c1 = new Clinic(1, "Chanhassen");

        Patient p2 = new Patient(1, "Joseph");
        Doctor d2 = new Doctor(1, "Lauren");
        Clinic c2 = new Clinic(1, "Lakeville");

        Patient p3 = new Patient(1, "Zach");
        Doctor d3 = new Doctor(1, "Robert");
        Clinic c3 = new Clinic(1, "Plymouth");

        p1.bookAppointment(d1, c1);
        System.out.println();
        p2.bookAppointment(d2, c3);
        System.out.println();
        p3.bookAppointment(d3, c2);
        System.out.println();
        p3.bookAppointment(d2, c1);
    }
}