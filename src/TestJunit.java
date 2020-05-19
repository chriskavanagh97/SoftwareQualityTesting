import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class TestJunit {

    ArrayList<Survey> surveys = new ArrayList<>();

    Controller controller = new Controller("first survey");
    ArrayList<Question> questions = new ArrayList<Question>();

    Survey survey = new Survey("Survey Test");
    Question one = new Question("Customer Service");
    Question Two = new Question("Cleanliness");

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
        //Here I am testing that a user can create a survey with multiple questions

        //Collection to represent questions

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

    @Test(expected = IllegalArgumentException.class)
    public void questionAnswerValue()
    {
        //Here I am testing that a user cannot make a survey with an empty string
        Survey survey1 = new Survey();
        Survey survey2 = new Survey("Second Survey");
        Survey survey3 = new Survey("Third Survey");

            surveys.add(survey1);
            surveys.add(survey2);
            surveys.add(survey3);

        }
        //========================================================================================================
        //Tests for Questions
        //========================================================================================================

    @Test
    public void CreateQuestion() {
        //Testing the correct questions are created added to the survey


        //Collection to represent questions
        //adding question to list
        questions.add(one);
        questions.add(Two);

        Survey newsurvey = controller.SurveyMultipleQuestions("MyQuestions", questions);

        assertEquals("Customer Service", newsurvey.getQuestions().get(0).getQuestion());

    }

        @Test(expected = IllegalArgumentException.class)
        public void BlankQuestion()
        {
            //Here I am testing that a user can't make a question with an empty string

            Question question = new Question("");
            Question question2 = new Question("");

        }

    @Test
    public void questionAnswer()
    {
        //Here I am testing can a user input an answer

        controller.questionAnswer(one, 3);
        assertEquals(3, one.getAnswer());

    }

    @Test(expected = IllegalArgumentException.class)
    public void NegativeanswerValue()
    {

        one.setAnswer(6);

    }

    //========================================================================================================
    //Tests for Survey Responses
    //========================================================================================================

    @Test
    public void surveyResponseCreationTest()
    {

        //adding question to list
        questions.add(one);
        questions.add(Two);
        String surveyname = survey.getName();

        SurveyResponse surveyresponse = controller.SurveyResponseCreation(surveyname, questions);
        assertTrue(surveyresponse instanceof SurveyResponse);

    }

    @Test
    public void CheckingforMultipleSurveyResponses()
    {
        //First Survey response creation
        //============================================================================================


        //Ensuring that the answers have a value
        one.setAnswer(3);
        Two.setAnswer(5);

        //adding question to list
        questions.add(one);
        questions.add(Two);
        String surveyname = survey.getName();

        //Creating survey response
        SurveyResponse surveyr =  controller.SurveyResponseCreation(surveyname, questions);
        //==============================================================================================

        //Second Survey response creation
        //============================================================================================
        Survey survey2 = new Survey("Survey Quality");
        Question service = new Question("Overall Service");
        Question experience = new Question("Experience");

        //Ensuring that the answers have a value
        one.setAnswer(3);
        Two.setAnswer(5);

        //adding question to list
        questions.add(one);
        questions.add(Two);
        surveyname = survey.getName();

        //Creating survey response
        SurveyResponse surveyr2 =  controller.SurveyResponseCreation(surveyname, questions);
        //==============================================================================================

        ArrayList<SurveyResponse> responses = new ArrayList<>();

        responses.add(surveyr);
        responses.add(surveyr2);



        assertEquals(2,  controller.surveyResponse(responses).size());

    }

    @Test
    public void IndividualResponses()
    {

        // Survey response creation
        //Ensuring that the answers have a value
        one.setAnswer(3);
        Two.setAnswer(5);

        //adding question to list
        questions.add(one);
        questions.add(Two);
        String surveyname = survey.getName();

        //Creating survey response
        SurveyResponse surveyr =  controller.SurveyResponseCreation(surveyname, questions);


        //Creating a list of survey responses to ensure I keep track of all
        ArrayList<SurveyResponse> responses = new ArrayList<>();
        responses.add(surveyr);


        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3,5));
        assertEquals(expected,  controller.surveyResponse(responses).get(0).getIndividualResponses());

    }


    //Searching Tests
    //==================================================================================================================


    @Test
    public void SurveyByName()
    {

        //Searching and getting a survey by Name

        Survey surveyTwo = new Survey("Survey Quality");
        Survey SurveyThree = new Survey("Survey Customer");



        surveys.add(survey);
        surveys.add(surveyTwo);
        surveys.add(SurveyThree);

        Survey tester = controller.getSurveybyName(surveys, surveyTwo.getName());

        assertEquals( "Survey Quality" , tester.getName());
    }


}



