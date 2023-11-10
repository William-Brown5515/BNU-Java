import java.util.ArrayList;
public class Stocklist {
ArrayList<Product> products;  
    public Stocklist() {
        ArrayList<Product> products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Integer num) {
        products.remove(num);
    } 

    public void printProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.print("Product Id   ");
            System.out.print(products.get(i).id);
            System.out.print("     Product Name   ");
            System.out.print(products.get(i).name);
            System.out.print("     Product Quantity   ");
            System.out.print(products.get(i).quantity);
            System.out.print("     Number in list   ");
            System.out.println(i);
        }
    }
}


