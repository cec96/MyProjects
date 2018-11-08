import java.math.*;
import java.util.Scanner;

public class Person implements BirthDateCalculate{
    private String fName, midIni, lName, message, question;
    protected String puid;
    protected Name myName;
    protected Contact myContact;
    protected Address myAddress;
    protected String age;
    protected String birthDay;
    protected String personType;
/*
    public Person(String fName, String midIni, String lName, String puid){
        this.fName = fName;
        this.lName = lName;
        this.midIni = midIni;
        this.puid = puid;
        //this.message = message;
        //this.question = question;
    }
*/
    public Person (String puid){
        this.puid = puid;
            myName = new Name();
            myContact = new Contact();
            myAddress = new Address();
            this.personType = "Person";
    }
    //lab 6 methods
    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return age;
    }

    public void setBirthDay(String bday){
        this.birthDay = bday;
    }

    public String getBirthDay(){
        return this.birthDay;
    }

    //Lab 4 methods
    public void createNameInfo(){
        myName.setNameValues();
    }

    public void createAddressInfo(){
        myAddress.setAddressInfo();
    }

    public void createContactInfo(){
        myContact.setContactInfo();
    }
    //Lab 3 methods
    public void setfName(String fName) {
        this.myName.setFirstName(fName);
    }

    public String getfName(){
        return this.myName.getFirstName();
    }

    public void setMidIni(String midIni) {
        this.myName.setMidInitial(midIni);
    }

    public String getMidIni(){
        return this.myName.getMidInitial();
    }

    public void setlName(String lName){
        this.myName.setLastName(lName);
    }

    public String getlName(){
        return myName.getLastName();
    }

    public void setPuid(String puid){
        this.puid = puid;
    }

    public String getPuid(){
        return puid;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }

    @Override
    //theDay format "YYYY-MM-DD"
    public String calcAge(String theDay) {
        String[] theirBday = theDay.split("-");
        String currentDate = String.valueOf(java.time.LocalDate.now());
        String[] currentDateInfo = currentDate.split("-");
        int theAge = Integer.parseInt(currentDateInfo[0]) - Integer.parseInt(theirBday[0]);

        if(Integer.parseInt(theirBday[1])< Integer.parseInt(currentDateInfo[1])){
            return String.valueOf(theAge);
        }else if(Integer.parseInt(theirBday[1])==Integer.parseInt(currentDateInfo[1])){
            if(Integer.parseInt(theirBday[2]) < Integer.parseInt(currentDateInfo[2])){
                return String.valueOf(theAge-1);
            }else{
                return String.valueOf(theAge);
            }
        }else{
            return String.valueOf(theAge-1);
        }
    }
}
