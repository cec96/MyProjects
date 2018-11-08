public class GradStudent extends Student implements BirthDateCalculate{

    private String thesisTitle;
    private String advisorName;

    public GradStudent(String puid) {
        super(puid);
    }

    public void setThesisTitle(String thesisTitle){
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle(){
        return thesisTitle;
    }

    public void setAdvisorName(String advisorName){
        this.advisorName = advisorName;
    }

    public String getAdvisorName(){
        return advisorName;
    }
}
