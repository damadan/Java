package com.company;

public class TestAuthor {

    public static void main(String[] args) {
Author a1=new Author("Pelevin","pelevin@mailru",'m');
        System.out.println(a1.toString());


        System.out.println("test getName");
        System.out.println(a1.getName());

        System.out.println("test getGender");
        System.out.println(a1.getGender());

        System.out.println("test getEmail");
        System.out.println(a1.getemail());

        System.out.println("test setName");
        a1.setName("puskin");
        System.out.println(a1.getName());

        System.out.println("test setEmail");
        a1.setEmail("puskin@mail.ru");
        System.out.println(a1.getemail());





    }
}
