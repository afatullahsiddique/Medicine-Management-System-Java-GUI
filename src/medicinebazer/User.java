
package medicinebazer;

class User {
    private int id;          
    private String name,address,phone,email,username,password;
    
    public User(int id, String name, String address, String phone,String email,String username,String password){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.username=username;
        this.password=password;
    }
  
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getphone(){
        return phone;
    }
    public String getemail(){
        return email;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    
}
