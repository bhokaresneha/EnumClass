package com.hospital;

public class Hospital {
    private int ID;
    private String name;
    private int age;
    private String bloodGroup;


/*
    public Hospital(int ID, String name, int age, String bloodGroup) {
        this.ID=ID;
        this.name=name;
        this.age=age;
        this.bloodGroup=bloodGroup;
    }
*/

    public  int getID(){
        return ID;
        }
    public  String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public  String getBloodGroup(){
        return bloodGroup;
    }

    public  void setID(int ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
    public  String toString(){
        return ("id=>"+ID+"\tname=>"+name+"\tage=>"+age+"\tblood group=>"+bloodGroup);
    }
}
