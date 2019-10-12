
package guibasedsockets;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Products implements Serializable
{
  int productID;
  String productName;
  double productPrice;
  double productUnits;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductUnits() {
        return productUnits;
    }

    public void setProductUnits(double productUnits) {
        this.productUnits = productUnits;
    }

    @Override
    public String toString() {
        return   " " + productID + ",  " + productName + ",  " +
                productPrice + ", " + productUnits;
    }

      

    
}
