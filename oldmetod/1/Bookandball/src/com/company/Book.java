package com.company;

public class Book {
    private String name;
    private String tema;
    public Book(String n, String a){
        name = n;
        tema = a;
    }
    public Book(String n){
        name = n;
        tema = "не указано";

    }
    public Book(){
        name = "не указано";
        tema = "не указано";
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getTema() {
        return tema;
    }
    public String toString(){
        return this.name+", тема "+this.tema;
    }
    public void isIntersting() {
        if (name.length() > 3) {
            System.out.println("book is interesting)");
        }
        else {
            System.out.println("book isnot interesting");
        }

    }
}