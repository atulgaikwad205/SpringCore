package com.example.FileHandling.JavaConfig;

import org.springframework.stereotype.Component;

//@Component()
public class Book {
    private String bookName;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book(String bookName, Student student) {
        this.bookName = bookName;
        this.student = student;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", student=" + student +
                '}';
    }

    public void readName(){
        System.out.println("reading book..!");
    }
}
