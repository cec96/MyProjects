import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class Chatroom {
    private Person currentPerson, currentReceiver;
    private String currentQuestion = "";
    private String currentMessage = "";
    public Chatroom(Person[] users){

    }

    public static void main(String[] args){

        //HashMap<String,Person> users = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.print("How many users do you want to enter into the chatroom?: ");
        int numUsers = in.nextInt();
        in.nextLine();
        Person[] users = new Person[numUsers];
        Chatroom thisRoom = new Chatroom(users);



        for(int i = 0;i<numUsers;i++){
           /*
            users[i] = new Person("","","",0);
            System.out.println("User "+(i+1)+":");

            System.out.print("Frist name: ");
            users[i].setfName(in.nextLine());

            System.out.print("Middle initial: ");
            users[i].setMidIni(in.nextLine());

            System.out.print("Last name: ");
            users[i].setlName(in.nextLine());

            System.out.print("PUID: ");
            users[i].setPuid(in.nextInt());
            in.nextLine();
            */
            System.out.println("Enter Info for user"+(i+1));
            System.out.print("PUID:");
            String myPUID = in.nextLine();

           users[i] = new Person(myPUID);
           users[i].createNameInfo();
           users[i].createAddressInfo();
           users[i].createContactInfo();



        }

        while (!thisRoom.currentMessage.equals("END")){
            String sendName,receiveName, qOrM, text;
            System.out.println("Please begin the chat!");
            boolean userNotFound = true;
            do {
                System.out.print("Sender Name: ");
                sendName = in.nextLine();
                for (int i = 0; i < users.length; i++) {
                    if (users[i].getlName().equalsIgnoreCase(sendName)) {
                        thisRoom.currentPerson = users[i];
                        userNotFound = false;
                        break;
                    }
                }

                if (userNotFound == true){
                    System.out.println("That user does not exist please enter a valid user.");
                }
            }while(userNotFound);

            boolean userNotFound2 = true;
            do {
                System.out.print("Receiver Name: ");
                receiveName = in.nextLine();
                for (int i = 0; i < users.length; i++) {
                    if (users[i].getlName().equalsIgnoreCase(receiveName)) {
                        thisRoom.currentReceiver = users[i];
                        userNotFound2 = false;
                        break;

                    }
                }

                if (userNotFound2 == true){
                    System.out.println("That user does not exist please enter a valid user.");
                }
            }while(userNotFound2);

            System.out.print("Question or Message: ");
                qOrM = in.nextLine();
                if(qOrM.equalsIgnoreCase("question")){
                    System.out.print("Text: ");
                    thisRoom.currentQuestion = in.nextLine();
                    thisRoom.currentReceiver.setQuestion(thisRoom.currentQuestion);
                    System.out.println(thisRoom.currentPerson.getlName() + " asked " + thisRoom.currentReceiver.getlName() + ",\"" + thisRoom.currentReceiver.getQuestion() + "\"");
                }else{
                    System.out.print("Text: ");
                    thisRoom.currentMessage = in.nextLine();
                    thisRoom.currentReceiver.setMessage(thisRoom.currentMessage);
                    System.out.println(thisRoom.currentPerson.getlName() + " said to " + thisRoom.currentReceiver.getlName() + ", \"" + thisRoom.currentReceiver.getMessage() + "\"" );
                }

        }
    }
}
