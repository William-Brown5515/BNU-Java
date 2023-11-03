public class Product {
    int id;
    String name;
    int quantity;

    public Product(Integer id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    public void printProduct() {
        System.out.print("The ID of the product is:   ");
        System.out.println(this.id);
        System.out.print("The name of this product is:   ");
        System.out.println(this.name);
        System.out.print("The available quantity of this product is:   ");
        System.out.println(this.quantity);
    }

    public void setID(Integer id) {
        this.id = id;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
