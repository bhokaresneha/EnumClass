package com.hospital;

import java.util.*;

public class Hospitaloperations extends HospitalMain {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Hospital> detail = new ArrayList<>();
    static HashMap<String, ArrayList<Hospital>> hash = new HashMap<>();
    static HashMap<Department, HashMap<String, ArrayList<Hospital>>> dept = new HashMap<>();
    static String HospitalName;
    static char choice;



    public void hospital(Hospitaloperations hospitaloperations) {
        do {
            System.out.println("Enter your choice \n1.Add New Hospital \n2.Display Hospital Data ");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1 -> addHospital(hospitaloperations);
                case 2 -> displayHospitalData();
                case 3 -> hashDisplayDept();
            }
            System.out.println("To Add or Perform More Operations on Hospitals  press Y otherwise press N");
            choice = scanner.next().charAt(0);
        } while (choice != 'n' && choice != 'N');


    }

    private void addHospital(Hospitaloperations hospitaloperations) {
        do {
            System.out.println("Enter the Hospital Name");
            HospitalName = scanner.next();
            if (hash.containsKey(HospitalName)) {
                System.out.println("Hospital Already Exist ");
                break;
            } else {
                ArrayList<Hospital> details = new ArrayList<>();
                hospitaloperations.addPatientData(details);
                hash.put(HospitalName, details);

            }
            System.out.println("Patient Added " + dept + " ");
            System.out.println("To Add New Hospital  press Y otherwise press N");
            choice = scanner.next().charAt(0);
        } while (choice != 'n' && choice != 'N');
    }

    private void addDepartment(HashMap<String, ArrayList<Hospital>> hash) {
        Hospital hospital=new Hospital();
        System.out.println("In Which Department you want to Add Patient"+hospital.getName());
        System.out.println("\n 1.ICU \t2.GENERAL-1 \t3.General-2 \t4.OPD");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                dept.put(Department.ICU,hash);
                break;
            case 2:
                dept.put(Department.GENERAL1,hash);
            case 3:
                dept.put(Department.GENERAL2,hash);
                break;
            case 4:
                dept.put(Department.OPD,hash);
        }
    }

    private static void hashDisplayDept() {
        for(Map.Entry<Department, HashMap<String, ArrayList<Hospital>>> data:dept.entrySet()){
            System.out.println(data);
        }
    }
    private static void displayHospitalData() {
        for(Map.Entry<String, ArrayList<Hospital>> data:hash.entrySet()){
            for( Hospital h:data.getValue()) {
                System.out.println("Hospital Name=>"+data.getKey()+"\nPatient Data=>"+h);
            }
        }
    }

    public void addPatientData(ArrayList<Hospital> details){
        do {

            System.out.println(" Enter operation 1.add 2.display");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    addPatient(details);
                    break;
                case 2:
                    displayHospitalData();
                    break;
            }
            System.out.println("Do you Want to add new Patient press Y otherwise press N");
            choice = scanner.next().charAt(0);
        } while (choice != 'n' && choice != 'N');

    }
    private void addPatient(ArrayList<Hospital> detail) {

        Hospital hospital=new Hospital();
        System.out.println("Enter the ID");
        hospital.setID(scanner.nextInt());
        System.out.println("Enter the name");
        hospital.setName(scanner.next());
        System.out.println("Enter the Age");
        hospital.setAge(scanner.nextInt());
        System.out.println("Enter the BloodGroup");
        hospital.setBloodGroup(scanner.next());

        // addding data into array list
        detail.add(hospital);
        addDepartment(hash);

    }
}
