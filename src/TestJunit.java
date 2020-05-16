import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


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

        assertEquals("Overall Quality",controller.createSurveyQuestions("Service Quality", "Overall Quality").getName());
    }

    @Test
    public void TestingMultipleSurveys()
    {
        //Here I am testing if a user can create a survey with multiple questions

        Survey survey1 = new Survey("first Survey");
        Survey survey2 = new Survey("Second Survey");
        Survey survey3 = new Survey("Third Survey");

        surveys.add(survey1);
        surveys.add(survey2);
        surveys.add(survey3);

        assertEquals(3, controller.MultipleSurveys(surveys).size());

    }
}
