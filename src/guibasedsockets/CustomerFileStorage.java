
package guibasedsockets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class CustomerFileStorage {
    
    public void writeCustomer(Customers c) throws IOException
    {
     File testWriter = new File("customer.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true));
        
        out.write(c.getCustomerID());
        out.write(", ");
        out.write(c.getFirstName());
        out.write(", ");
        out.write(c.getLastName());
        out.write(" , ");
        out.write(c.getLastName());
        out.write(" , ");
        out.write(c.getAddress());
        out.newLine();
        out.close();
    
        
    }
}
