
package guibasedsockets;

import java.io.Serializable;


public class Customers implements Serializable
{
 int customerID;
 String firstName;
 String lastName;
 String address;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return   " " + customerID + ",  " + firstName + ",  " + lastName +
                ",  " + address;
    }
 
 

    
}
