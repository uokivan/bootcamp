public class Order {
  


  // Alternative
  private Item[] items;

  public Order(){
    this.items = new Item[0];
  }

  public void add(Item newItem){
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  // need to change to BigDecimal
  public double checkoutAmount() {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++) {
      total += this.items[i].subtotal();
    }
    return total;
  }

  public static void main(String[] args) {
    Order order = new Order(); // array length = 0
    System.out.println("itemA : " + order.items.length);

    Item itemA = new Item(99,2);
    order.add(itemA); // array length = 1
    System.out.println("itemA : " + order.items.length);

    Item itemB = new Item(14,3);
    order.add(itemB); // array length = 2
    System.out.println("itemB : " + order.items.length);

    // this is not good......
    for (int i = 0; i < order.items.length; i++){
      System.out.println("Price : " + order.items[i].getPrice());
      System.out.println("Quantity : " + order.items[i].getQuantity());
      System.out.println("Subtotal : " + order.items[i].subtotal());
    }

    System.out.println( " ----------- ");

    System.out.println("CheckoutAmount : $ " + order.checkoutAmount());
  }
}
