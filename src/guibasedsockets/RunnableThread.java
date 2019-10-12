/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasedsockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class RunnableThread implements Runnable

{
    private InputStream in;
    private OutputStream out;

    public RunnableThread(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }
    
    

    @Override
    public void run() 
    
    {
       ThreadManager tmanager = new ThreadManager();
        try {
            tmanager.threadcommunicator(in, out);
        } catch (Exception ex) 
            {
            
            Logger.getLogger(RunnableThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
