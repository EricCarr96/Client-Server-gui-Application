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
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class ThreadManager {
    
    public void threadcommunicator(InputStream inStream, OutputStream outStream) throws IOException, ClassNotFoundException
    {
        ObjectInputStream in = new ObjectInputStream(inStream);
         ObjectOutputStream out = new ObjectOutputStream(outStream);
         
         DataRequest request = (DataRequest) in.readObject();
          switch (request.getDataType()) {
            case DataRequest.CUSTOMERS:
                
                out.writeObject(DataRequest.getCUSTOMERS());
                out.flush();
                break;
            case DataRequest.PRODUCTS:
                out.writeObject(DataRequest.getPRODUCTS());
                out.flush();
                break;
    
    }
    
}

     public void CustomerFile() throws FileNotFoundException, IOException {
        File f = new File("Test/customer.csv"); //open file
        FileReader reader = new FileReader(f); //create reader
        BufferedReader br = new BufferedReader(reader); //buffered reader to read line of text

        String line = br.readLine(); //read line of text
        while (line != null) { //if line is not empty
            
            System.out.println(line); //print line of text
            line = br.readLine(); //read next line
         
            
        }
     
     }
    public void getProducts() throws FileNotFoundException, IOException {
        File f = new File("Test/product.csv"); //open file
        FileReader reader = new FileReader(f); //create reader
        BufferedReader br = new BufferedReader(reader); //buffered reader to read line of text

        String line = br.readLine(); //read line of text
        while (line != null) { //if line is not empty
            
            System.out.println(line); //print line of text
            line = br.readLine(); //read next line
         
            
        }
     
     }

}