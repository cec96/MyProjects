import java.util.Scanner;
public class Name {
    private String firstName;
    private String midInitial;
    private String lastName;

    public Name(String firstName, String midInitial, String lastName){
        firstName = firstName;
        midInitial = midInitial;
        lastName = lastName;

    }

    public Name(){

    }

    public void setNameValues(){
        Scanner in = new Scanner(System.in);
        System.out.print("Frist name: ");
        setFirstName(in.nextLine());
        System.out.print("Middle initial: ");
        setMidInitial(in.nextLine());
        System.out.print("Last name: ");
        setLastName(in.nextLine());
    }

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public String getFirstName(){
        return this.firstName;

    }

    public void setMidInitial(String midIni){
        this.midInitial = midIni;
    }

    public String getMidInitial(){
        return this.midInitial;
    }

    public void setLastName(String lname){
        this.lastName = lname;
    }

    public String getLastName(){
        return this.lastName;
    }
}

