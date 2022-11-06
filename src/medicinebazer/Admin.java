
package medicinebazer;


public class Admin {
             
    private String medId, medName,medPrice,medQty,medFabDate,medExpDate,medCompany;

    public Admin(String medId, String medName, String medPrice, String medQty,String medFabDate,String medExpDate,String medCompany){

    this.medId=medId;
    this.medName=medName;
    this.medPrice=medPrice;
    this.medQty=medQty;
    this.medFabDate=medFabDate;
    this.medExpDate=medExpDate;
    this.medCompany=medCompany;
}
        
    public String getid(){
    return medId;
    }
    public String getname(){
        return medName;
    }
    public String getprice(){
        return medPrice;
    }
    public String getqty(){
        return medQty;
    }
    public String getfab(){
        return medFabDate;
    }
    public String getexp(){
        return medExpDate;
    }
    public String getcomp(){
        return medCompany;
    }
        
}
