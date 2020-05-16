import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class TestJunit {

    ArrayList<Survey> surveys = new ArrayList<>();

    Controller controller = new Controller("first survey");

    @Test
    public void CreatingSurvey() {

        //Here I am testing if the user can create a survey with just a name no question
        Controller controller = new Controller("first survey");


        assertEquals("first survey", controller.CreateSurvey().getName());

    }

    @Test
    public void SurveyAddQuestion()
    {
        //Here I am testing can you add a survey with one Question

        assertEquals("Overall Quality",controller.createSurveyQuestions("Service Quality", "Overall Quality").getName());
    }

    @Test
    public void addMultipleQuestions()
    {
        Question one = new Question("Customer Service");
        Question Two = new Question("Cleanliness");
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(one);
        questions.add(Two);

        Survey newsurvey = controller.SurveyMultipleQuestions("MyQuestions", questions);

        assertTrue(newsurvey.getQuestions().contains(one));

    }



    @Test
    public void TestingMultipleSurveys()
    {
        //Here I am testing if a user can create multiple surveys

        Survey survey1 = new Survey("first Survey");
        Survey survey2 = new Survey("Second Survey");
        Survey survey3 = new Survey("Third Survey");

        surveys.add(survey1);
        surveys.add(survey2);
        surveys.add(survey3);

        assertEquals(3, controller.MultipleSurveys(surveys).size());

    }


}
