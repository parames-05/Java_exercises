import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

abstract class Person {
    private String name;
    private int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract void displayDetails();
}

class Patient extends Person {
    private int age;
    private String disease;
    private String bloodGroup;

    Patient(String name, int id, int age, String disease, String bloodGroup) throws InvalidAgeException {
        super(name, id);

        if (age <= 0) {
            throw new InvalidAgeException("Invalid patient age: " + age);
        }

        this.age = age;
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    void displayDetails() {
        System.out.println("Patient ID     : " + getId());
        System.out.println("Patient Name   : " + getName());
        System.out.println("Age            : " + age);
        System.out.println("Disease        : " + disease);
        System.out.println("Blood Group    : " + bloodGroup);
        System.out.println("--------------------------------");
    }
}

class Doctor extends Person {
    private int experience;
    private String speciality;
    private int fees;

    Doctor(String name, int id, int experience, String speciality, int fees) {
        super(name, id);
        this.experience = experience;
        this.speciality = speciality;
        this.fees = fees;
    }

    public int getExperience() {
        return experience;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getFees() {
        return fees;
    }

    @Override
    void displayDetails() {
        System.out.println("Doctor ID      : " + getId());
        System.out.println("Doctor Name    : " + getName());
        System.out.println("Experience     : " + experience + " years");
        System.out.println("Speciality     : " + speciality);
        System.out.println("Fees           : " + fees);
        System.out.println("--------------------------------");
    }
}

class Dept {
    private String deptName;
    private int deptId;

    Dept(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    void displayDetails() {
        System.out.println("Department ID   : " + deptId);
        System.out.println("Department Name : " + deptName);
        System.out.println("--------------------------------");
    }
}

class Appointment {
    private String patient;
    private String doctor;
    private int appointmentId;
    private String date;
    private String time;
    private String status;

    Appointment(String patient, String doctor, int appointmentId,
                String date, String time, String status) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    void displayDetails() {
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient        : " + patient);
        System.out.println("Doctor         : " + doctor);
        System.out.println("Date           : " + date);
        System.out.println("Time           : " + time);
        System.out.println("Status         : " + status);
        System.out.println("--------------------------------");
    }
}

class PatientNotFoundException extends Exception {
    PatientNotFoundException(String message) {
        super(message);
    }
}

class DoctorNotFoundException extends Exception {
    DoctorNotFoundException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Dept> departments = new ArrayList<>();
    private LinkedList<Appointment> appointments = new LinkedList<>();

    void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    void addDepartment(Dept dept) {
        departments.add(dept);
        System.out.println("Department added successfully.");
    }

    Patient searchPatient(int id) throws PatientNotFoundException {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }

        throw new PatientNotFoundException(
                "Patient with ID " + id + " not found."
        );
    }

    Doctor searchDoctor(int id) throws DoctorNotFoundException {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }

        throw new DoctorNotFoundException(
                "Doctor with ID " + id + " not found."
        );
    }

    void removePatient(int id) throws PatientNotFoundException {
        Patient patient = searchPatient(id);
        patients.remove(patient);
        System.out.println("Patient removed successfully.");
    }

    void removeDoctor(int id) throws DoctorNotFoundException {
        Doctor doctor = searchDoctor(id);
        doctors.remove(doctor);
        System.out.println("Doctor removed successfully.");
    }

    void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }

        for (Person patient : patients) {
            patient.displayDetails();
        }
    }

    void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        for (Person doctor : doctors) {
            doctor.displayDetails();
        }
    }

    void displayDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }

        for (Dept dept : departments) {
            dept.displayDetails();
        }
    }

    void searchDoctorBySpeciality(String speciality) {
        boolean found = false;

        for (Doctor doctor : doctors) {
            if (doctor.getSpeciality().equalsIgnoreCase(speciality)) {
                doctor.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No doctor found for speciality: " + speciality);
        }
    }

    void bookAppointment(int patientId, int doctorId, int appointmentId,
                         String date, String time)
            throws PatientNotFoundException, DoctorNotFoundException {

        Patient patient = searchPatient(patientId);
        Doctor doctor = searchDoctor(doctorId);

        Appointment appointment = new Appointment(
                patient.getName(),
                doctor.getName(),
                appointmentId,
                date,
                time,
                "Booked"
        );

        appointments.add(appointment);

        System.out.println("Appointment booked successfully.");
    }

    void cancelAppointment(int appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appointmentId) {
                appointment.setStatus("Cancelled");
                System.out.println("Appointment cancelled successfully.");
                return;
            }
        }

        System.out.println("Appointment not found.");
    }

    void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.displayDetails();
        }
    }
}

public class multispeciality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {

            System.out.println("\n==========================================");
            System.out.println("     MULTI-SPECIALITY HOSPITAL");
            System.out.println("       MANAGEMENT SYSTEM");
            System.out.println("==========================================");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Department");
            System.out.println("4. Search Patient");
            System.out.println("5. Search Doctor");
            System.out.println("6. Remove Patient");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Display Patients");
            System.out.println("9. Display Doctors");
            System.out.println("10. Display Departments");
            System.out.println("11. Book Appointment");
            System.out.println("12. Cancel Appointment");
            System.out.println("13. Display Appointments");
            System.out.println("14. Search Doctor by Speciality");
            System.out.println("15. Exit");
            System.out.println("==========================================");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter patient name: ");
                        String pname = sc.nextLine();

                        System.out.print("Enter patient ID: ");
                        int pid = sc.nextInt();

                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter disease: ");
                        String disease = sc.nextLine();

                        System.out.print("Enter blood group: ");
                        String blood = sc.nextLine();

                        Patient patient = new Patient(
                                pname,
                                pid,
                                age,
                                disease,
                                blood
                        );

                        hospital.addPatient(patient);
                        break;

                    case 2:
                        System.out.print("Enter doctor name: ");
                        String dname = sc.nextLine();

                        System.out.print("Enter doctor ID: ");
                        int did = sc.nextInt();

                        System.out.print("Enter experience: ");
                        int exp = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter speciality: ");
                        String speciality = sc.nextLine();

                        System.out.print("Enter fees: ");
                        int fees = sc.nextInt();
                        sc.nextLine();

                        Doctor doctor = new Doctor(
                                dname,
                                did,
                                exp,
                                speciality,
                                fees
                        );

                        hospital.addDoctor(doctor);
                        break;

                    case 3:
                        System.out.print("Enter department name: ");
                        String deptName = sc.nextLine();

                        System.out.print("Enter department ID: ");
                        int deptId = sc.nextInt();
                        sc.nextLine();

                        Dept dept = new Dept(deptName, deptId);

                        hospital.addDepartment(dept);
                        break;

                    case 4:
                        System.out.print("Enter patient ID: ");
                        int searchPid = sc.nextInt();

                        Patient foundPatient = hospital.searchPatient(searchPid);
                        foundPatient.displayDetails();
                        break;

                    case 5:
                        System.out.print("Enter doctor ID: ");
                        int searchDid = sc.nextInt();

                        Doctor foundDoctor = hospital.searchDoctor(searchDid);
                        foundDoctor.displayDetails();
                        break;

                    case 6:
                        System.out.print("Enter patient ID: ");
                        int removePid = sc.nextInt();

                        hospital.removePatient(removePid);
                        break;

                    case 7:
                        System.out.print("Enter doctor ID: ");
                        int removeDid = sc.nextInt();

                        hospital.removeDoctor(removeDid);
                        break;

                    case 8:
                        hospital.displayPatients();
                        break;

                    case 9:
                        hospital.displayDoctors();
                        break;

                    case 10:
                        hospital.displayDepartments();
                        break;

                    case 11:
                        System.out.print("Enter patient ID: ");
                        int appointmentPid = sc.nextInt();

                        System.out.print("Enter doctor ID: ");
                        int appointmentDid = sc.nextInt();

                        System.out.print("Enter appointment ID: ");
                        int appointmentId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter date: ");
                        String date = sc.nextLine();

                        System.out.print("Enter time: ");
                        String time = sc.nextLine();

                        hospital.bookAppointment(
                                appointmentPid,
                                appointmentDid,
                                appointmentId,
                                date,
                                time
                        );
                        break;

                    case 12:
                        System.out.print("Enter appointment ID: ");
                        int cancelId = sc.nextInt();

                        hospital.cancelAppointment(cancelId);
                        break;

                    case 13:
                        hospital.displayAppointments();
                        break;

                    case 14:
                        System.out.print("Enter speciality: ");
                        String searchSpeciality = sc.nextLine();

                        hospital.searchDoctorBySpeciality(searchSpeciality);
                        break;

                    case 15:
                        System.out.println("Exiting hospital management system...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (PatientNotFoundException |
                     DoctorNotFoundException |
                     InvalidAgeException e) {

                System.out.println("Exception: " + e.getMessage());

            } catch (Exception e) {

                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }
}
