package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) throws FileNotFoundException {
//        File myFile = new File("newFile.txt");
//        try{
//            myFile.createNewFile();
//        }catch (IOException e){
//            System.out.println("Unable to create new file");
//        }

        //Write in a File
//        try{
//            FileWriter fileWriter = new FileWriter("newFile.txt");
//            fileWriter.write("First file written using FileWriter");
//            fileWriter.close();
//        }catch (IOException e){
//            System.out.println("Cannot write in file");
//        }

        //Reading from a file
//        File myfile = new File("newFile.txt");
//        Scanner sc = new Scanner(myfile);
//        while(sc.hasNextLine()){
//            String s = sc.nextLine();
//            System.out.println(s);
//        }
//        sc.close();

        //Deleting the file
        File myFile = new File("newFile.txt");
        if(myFile.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File cannot be deleted / Error encountered");
        }
    }
}
