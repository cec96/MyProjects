import java.util.Scanner;
public class Contact {
    private String email;
    private String phoneNum;

    public Contact(String phoneNum, String email){
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Contact(){

    }

    public void setContactInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Email: ");
        setEmail(in.nextLine());
        System.out.print("Phone number: ");
        setPhoneNum(in.nextLine());
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }


}
