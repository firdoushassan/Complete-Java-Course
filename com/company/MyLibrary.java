package com.company;
import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String [] books;
    String [] issuebooks;
    int nOB;
    int isB;

    Library(){
        this.books = new String[100];
        this.nOB = 0;
    }
    public void aB(){
        System.out.println("enter book to add");
        String b = sc.nextLine();
        this.books[nOB] = b;
        nOB ++;
        System.out.println("Book Added");
    }
    public void sAB(){
        System.out.println("Available books are : ");
        for (String b : this.books){
            if(b ==null){
                continue;
            }
            System.out.println("* " +b);
        }
    }
    public void isB(){
        System.out.println("Enter book to issue");
        String b = sc.nextLine();
        for (int i =0; i<this.books.length;i++){
            if(this.books[i].equals(b)){
                System.out.println("Book issued");
                this.books[i]=null;
                return;
            }
        }
    }
    public void reB(){
        System.out.println("Enter book to return");
        String b = sc.nextLine();
        this.books[nOB] = b;
        nOB ++;
        System.out.println("Book Returned");
    }
}

public class MyLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println("Welcome to library");
        System.out.println("Enter choice ");
        System.out.println("1. Add Book");
        System.out.println("2. Show Available Books");
        System.out.println("3. Issue book");
        System.out.println("4. return book");
        System.out.println("5. Exit");
        Scanner ch = new Scanner(System.in);
        while(true){
            System.out.println("Now ?");
            int choice = ch.nextInt();
            if(choice == 1){
                lib.aB();
            }
            if(choice == 2){
                lib.sAB();
            }
            if(choice == 3){
                lib.isB();
            }
            if(choice == 4){
                lib.reB();
            }
            if(choice == 5){
                break;
            }

        }
        System.out.println("Thank you");


    }
}
