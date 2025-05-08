public class Customer {
  private long id;
  private String name;
  private Order[] orders;

  public Customer(long id, String name) {
    this.orders = new Order[0];
    this.id = id;
    this.name = name;
  }

  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }

  // need to change to BigDecimal
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    if (total > 100000) {
      return true;
    } else {
      return false;
    }
  }


  // main()
  // John -> many Orders -> items
  public static void main(String[] args) {
    Customer[] customers = new Customer[0];

    Customer john = new Customer(customers.length,"John");
    System.out.println("length order : " + john.orders.length);

    Order order1 = new Order();

    Item order1itemA = new Item(99,2);
    order1.add(order1itemA);

    Item order1itemB = new Item(14,3);
    order1.add(order1itemB);

    john.add(order1);  // not VIP



    Order order2 = new Order();

    Item order2itemA = new Item(99,999);
    order1.add(order2itemA);

    Item order2itemB = new Item(140,10);
    order1.add(order2itemB);

    john.add(order2); // is VIP

    System.out.println("length order : " + john.orders.length);
    

    System.out.println("checkoutAmount : " + john.orders[0].checkoutAmount());

    System.out.println("isVIP : " + john.isVIP());

    System.out.println(john.id);
    System.out.println(john.name);

  }

}
