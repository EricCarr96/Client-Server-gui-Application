/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasedsockets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class DataRequest implements Serializable {
    
    private int dataType;
    public static final int CUSTOMERS = 0;
    public static final int PRODUCTS = 1;

    //getters & setters
    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public static int getCUSTOMERS() throws FileNotFoundException, IOException {
        
         File f = new File("Test/customer.csv"); //open file
        FileReader reader = new FileReader(f); //create reader
        BufferedReader br = new BufferedReader(reader); //buffered reader to read line of text

        String line = br.readLine(); //read line of text
        while (line != null) { //if line is not empty
            
            System.out.println(line); //print line of text
            line = br.readLine(); //read next line
         
        
       
    }
         return CUSTOMERS;
    }

    public static int getPRODUCTS() throws FileNotFoundException, IOException {
        
         File f = new File("Test/product.csv"); //open file
        FileReader reader = new FileReader(f); //create reader
        BufferedReader br = new BufferedReader(reader); //buffered reader to read line of text

        String line = br.readLine(); //read line of text
        while (line != null) { //if line is not empty
            
            System.out.println(line); //print line of text
            line = br.readLine(); //read next line
         
            
        
        
        
    }
    return PRODUCTS;
}

}