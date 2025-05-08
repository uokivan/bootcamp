import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  public Item(double price, int quantity){
    this.price = price;
    this.quantity = quantity;
  }

  public double subtotal(){
    BigDecimal priceBD = BigDecimal.valueOf(this.price);
    BigDecimal quantityBD = BigDecimal.valueOf(this.quantity);
    return priceBD.multiply(quantityBD).doubleValue();
  }

  // setter
  public void add(){
    this.quantity++;
  }

  public boolean deduct(){
    if(this.quantity > 0){
      this.quantity--;
      return true;
    }
    return false;
  }

  public double getPrice(){
    return this.price;
  }

  public double getQuantity(){
    return this.quantity;
  }


  public static void main(String[] args) {
    Item itemA = new Item(99.0, 1);
    itemA.add();
    itemA.add();
    itemA.deduct();

    System.out.println("price : " + itemA.price);
    System.out.println("quantity : " + itemA.quantity);
  }
}
