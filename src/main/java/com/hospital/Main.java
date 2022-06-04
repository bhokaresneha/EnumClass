package com.hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Contacts {
    private String firstName, lastName, address, city, state, zipCode, contactNo, email;


    /*public Contacts(String firstName, String lastName, String address, String city, String state, String zipCode, String contactNo, String email)
    {    this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactNo = contactNo;
        this.email = email;
    }
*/


    //Getter methods =The get method returns the variable value

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getContactNo(){
        return contactNo;
    }
    public String getZipCode(){
        return zipCode;
    }

    //Setter method =>The set method sets the value.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String toString(){
        return ("FirstName IS " + firstName + " \n LastNAme Is " + lastName + " \n Email Is " + email +
                "\n Contact No Is " + contactNo + "\n Address Is " + address + " \n City Is " + city + "\n State Is " + state +
                "\n Zip Code Is " + zipCode);

    }


}

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");
                /*Contacts contacts = new Contacts("Sneha", "Bhokare", "Matruchaya Apartment", "Pune", "Maharashtra","411014", "70570519131","bhokaresneha20@gmail.com");
                System.out.print(contacts.getFirstName()+" ");
                System.out.println(contacts.getLastName());
                System.out.println(contacts.getEmail());
                System.out.print(contacts.getAddress()+" ");
                System.out.println(contacts.getCity());
                System.out.print(contacts.getState()+" ");
                System.out.println(contacts.getZipCode());
                System.out.println(contacts.getContactNo());
addContactDetail()
*/
        addContactDetail();
        displayDetails();
    }


    static ArrayList<Contacts> contactDetails = new ArrayList();

    public static void addContactDetail() {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        contacts.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        contacts.setLastName(scanner.nextLine());
        System.out.println("Enter Email: ");
        contacts.setEmail(scanner.nextLine());
        System.out.println("Enter Address: ");
        contacts.setAddress(scanner.nextLine());
        System.out.println("Enter City Name: ");
        contacts.setCity(scanner.nextLine());
        System.out.println("Enter State: ");
        contacts.setState(scanner.nextLine());
        System.out.println("Enetr Zip Code:");
        contacts.setZipCode(scanner.nextLine());
        System.out.println("Enter contact Number:");
        contacts.setContactNo(scanner.nextLine());

        contactDetails.add(contacts);

        System.out.println("if you want to add multiple person to Address Book");
        System.out.println("If yes press 1");
        int n = scanner.nextInt();
        if (n == 1) {
            addContactDetail();
        } else
            System.out.println("");
    }

    public static void displayDetails() {
        Iterator itr = contactDetails.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
