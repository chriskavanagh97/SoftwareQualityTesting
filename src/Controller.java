import java.util.ArrayList;

public class Controller {

    String a;

    public Controller(String a)
    {
        this.a = a;

    }

    public Survey CreateSurvey()
    {
        Survey createSurvey = new Survey("a");
        return createSurvey;
    }


    public Survey createSurveyQuestions()
    {
        //Creation of question object
        Question firstquestion = new Question("questionname");
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(firstquestion);

        Survey firstquestionsurvey = new Survey("surveytitle" ,questions);

        return firstquestionsurvey;

    }

    public ArrayList<Survey> MultipleSurveys() {



        return MultipleSurveys();

    }
}
