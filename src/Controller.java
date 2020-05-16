import java.util.ArrayList;

public class Controller {
String a ="quality";

    //Allowing the user to pass a vairable into the constructor
    public Controller(String a)
    {
        this.a = a;

    }
    //Creating a survey with a name
    public Survey CreateSurvey()
    {
        Survey createSurvey = new Survey(a);
        return createSurvey;
    }

    //creating survey with name and a question
    public Survey createSurveyQuestions(String questionname,String surveytitle )
    {
        //Creation of question object
        Question firstquestion = new Question(questionname);
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(firstquestion);

        Survey firstquestionsurvey = new Survey(surveytitle ,questions);
        return firstquestionsurvey;

    }

    //creating multiple surveys
    public ArrayList<Survey> MultipleSurveys(ArrayList<Survey>surveys) {

        //returning the list of surveys so I can test for size to ensure multiple surveys can be made
        return surveys;

    }

    //Creating a survey with multiple questions
    public Survey SurveyMultipleQuestions(String surveyname,  ArrayList<Question> questions )
    {
        //creating a new survey with the name and list of questions
        Survey createSurvey = new Survey(surveyname, questions);

        return createSurvey;
    }
}
