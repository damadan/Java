package com.company;

public class Author
{
    private String email,name;
    private char gender;
    Author(String name,String email,char gender){
        this.email=email;
        this.name=name;
        this.gender=gender;
    }
    public String getName(){
        return this.name;
    }

    public char getGender (){
        return  this.gender;
    }
    public String getemail (){
        return  this.email;
    }
public void  setName(String name){this.name=name;}
public void  setEmail(String email){this.email=email;}
    public  String toString (){
        return "Author{"
                + "Name='" + name + '\''
                + ", gender=" + gender
                + ", email" + email
                + '}';
    }
}
