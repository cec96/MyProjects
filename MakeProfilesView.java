import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MakeProfilesView extends JFrame implements ActionListener {

    JPanel mainPanel;
    //Container mainContainer;
    ArrayList<Person> users;
    JCheckBox isGradStudent;
    JTextField firstName, middleInital, LastName;
    JLabel fname,mini,lname;
    public MakeProfilesView(){
        users = new ArrayList<>();

        mainPanel = new JPanel(new GridBagLayout());
        Container mainContainer = getContentPane();
        GridBagConstraints c = new GridBagConstraints();

        c.anchor = GridBagConstraints.FIRST_LINE_START;

        isGradStudent = new JCheckBox("Grad Student");
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(isGradStudent,c);

        fname = new JLabel("First Name");
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(fname,c);

        firstName = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(firstName,c);

        mini = new JLabel("Middle Initial");
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(mini,c);

        middleInital = new JTextField(5);
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(middleInital,c);



        mainContainer.add(mainPanel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args){
        MakeProfilesView myProfiles = new MakeProfilesView();
        myProfiles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myProfiles.setSize(400,500);
        myProfiles.setVisible(true);
    }
}
