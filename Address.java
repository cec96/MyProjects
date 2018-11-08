import java.util.Scanner;
public class Address {
    private String address1;
    private String address2;
    private String zipCode;
    private String stateAbrive;
    private String city;

    public Address(String streetName, String houseNum, String zipCode,String stateAbrive, String city){
        streetName = streetName;
        houseNum = houseNum;
        zipCode = zipCode;
        stateAbrive = stateAbrive;
        city = city;
    }

    public Address(){

    }

    public void setAddressInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Address 1: ");
        setAddress1(in.nextLine());
        System.out.print("Address 2: ");
        setAddress2(in.nextLine());

        String zipCode;
        do {
        System.out.print("Zip code: ");
        zipCode = in.nextLine();
        if(zipCode.length() < 5){
            System.out.println("invalid zip code, please enter a valid 5 digit zip code");
        }else{
            setZipCode(zipCode);
        }
        }
        while (zipCode.length()<5);

        System.out.print("State (exmpl. IN): ");
        setStateAbrive(in.nextLine());
        System.out.print("City: ");
        setCity(in.nextLine());
    }

    public void setAddress1(String add1){
        this.address1 = add1;
    }

    public String getAddress1(){
        return this.address1;
    }

    public void setAddress2(String add2){
        this.address2 = add2;
    }

    public String getAddress2(){
        return this.address2;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public void setStateAbrive(String stateAbrive){
        this.stateAbrive = stateAbrive;
    }

    public String getStateAbrive(){
        return this.stateAbrive;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }
}
