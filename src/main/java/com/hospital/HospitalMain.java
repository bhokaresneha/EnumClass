package com.hospital;



public class HospitalMain {
      public static void main(String[] args) {
        System.out.println("Welcome");
     //      Hospital hospital=new Hospital(1,"sneha",24,"b+");
            /* System.out.println("Details");
        System.out.println(hospital.getID());
        System.out.println(hospital.getName());
        System.out.println(hospital.getAge());
        System.out.println(hospital.getBloodGroup());
*/
        Hospitaloperations hospitalMain= new Hospitaloperations();
          hospitalMain.hospital(hospitalMain );
    }
}
