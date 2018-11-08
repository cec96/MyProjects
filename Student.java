public class Student extends Person implements BirthDateCalculate{

    private String major;
    private String favClass;
    private String gradDate;
    private boolean attendedHogwarts;


    public Student(String puid) {

        super(puid);
        this.personType = "Student";
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public void setFavClass(String favClass){
        this.favClass = favClass;
    }

    public String getFavClass(){
        return favClass;
    }

    public void setGradDate(String gradDate){
        this.gradDate = gradDate;
    }

    public String getGradDate(){
        return gradDate;
    }

    public void setAttendedHogwarts(boolean attended){
        this.attendedHogwarts = attended;
    }

    public boolean getAttendedHogwarts(){
        return attendedHogwarts;
    }

}
