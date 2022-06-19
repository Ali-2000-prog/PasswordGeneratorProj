/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Filler {
    synchronized public void SavePassword(String file,String pass,String user, String Email){
     try {
        FileWriter myWriter = new FileWriter("PasswordFiles/"+file+".txt");
        
        myWriter.write("account name of file: "+user+"\n");
        myWriter.write("Password: "+pass+"\n");
        myWriter.write("Email: "+Email);
        
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    
    synchronized public void ReadPassword(String file){
        try {
            File myObj = new File("PasswordFiles/"+file+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
//            e.printStackTrace();
    }
    }
    
    synchronized void DeleteFile(String file) throws FileNotFoundException{   
            File myObj = new File("PasswordFiles/"+file+".txt");
            if(!myObj.exists()){
                throw new FileNotFoundException("File Not Found");
            }
            if (myObj.delete()) { 
            System.out.println("Deleted the file: " + myObj.getName());
          } else {
            System.out.println("Failed to delete the file.");
        }
        
    }
}
