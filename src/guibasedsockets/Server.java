/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasedsockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class Server {

   
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {    
        ServerSocket server = new ServerSocket(67);
        while(true)
        {
         Socket socket = server.accept();
         RunnableThread tm = new RunnableThread(socket.getInputStream(), socket.getOutputStream());
         Thread t = new Thread(tm);
         t.start();
        
        }
      
    }
    
        
     

          
}

