
package medicinebazer;

class Booking {
    private int id,price,quantity; 
    private String name;
    
    public Booking(int id, String name, int quantity, int price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
  
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getquantity(){
        return quantity;
    }
    public int getprice(){
        return price;
    }
    
}
