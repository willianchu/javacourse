public class Store2 {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice; 
  
  // constructor method
  public Store2(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store2 cookieShop = new Store2("cookies", 12, 3.75);
  }
}