import java.util.ArrayList;
import java.util.Collections;

public class Survey {

    //Name of survey
    private String name;
    //Collection to represent questions
    private ArrayList<Question> questions = new ArrayList<Question>();
    //Collection to represent survey responses
    private ArrayList<SurveyResponse> responses = new ArrayList<SurveyResponse>();


    //Empty Constructor to make blank survey
    public Survey()
    {
        throw new IllegalArgumentException("Survey must have a name" );
    }

    //Allowing me to make a survey with multiple questions and a name
    public Survey(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    //Allows me to make a survey with just a name
    public Survey(String name) {
        this.name = name;

    }

    //Getting name for survey
    public String getName() {
        return name;
    }


    public ArrayList<Question> getQuestions() {
        return questions;
    }


}