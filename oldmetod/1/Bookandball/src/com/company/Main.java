package com.company;

public class Main {
    public static void main(String[] args) {
        Book kniga = new Book("first book","test");
kniga.setName("Nature of code");
System.out.println(kniga.getName());
kniga.isIntersting();
System.out.println("----------");
Ball a = new Ball("purple",12);
a.setSize(14);
System.out.println(a.getSize());
a.nicechoice();
System.out.println(a.toString());
    }
}
