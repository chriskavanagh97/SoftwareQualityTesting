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
        assertEquals(2, newsurvey.getQuestions().size());
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


        //Adding surveys to a list to ensure there a multiple surveys
        surveys.add(survey);
        surveys.add(surveyTwo);
        surveys.add(SurveyThree);

        Survey tester = controller.getSurveybyName(surveys, surveyTwo.getName());



        assertEquals( "Survey Quality" , tester.getName());
    }

    @Test
    public void SurveyResponseBySurveyName()
    {
        //Testing that a user can find a survey response based on a specific survey

        //Ensuring that the answers have a value
        one.setAnswer(3);
        Two.setAnswer(5);

        //adding question to list
        questions.add(one);
        questions.add(Two);
        String surveyname = survey.getName();
        SurveyResponse surveyr =  controller.SurveyResponseCreation(surveyname, questions);

        //Creating a 2nd survey response related to a different survey
        //=============================================================================================================

        Survey surveyTwo = new Survey("Survey Quality");
        Question newqone = new Question("Customer Service");
        Question newqtwo = new Question("Cleanliness");

        newqone.setAnswer(4);
        newqtwo.setAnswer(3);

        //adding question to list
        ArrayList<Question> questions2 = new ArrayList<Question>();
        questions2.add(newqone);
        questions2.add(newqtwo);
        surveyname = surveyTwo.getName();
        SurveyResponse surveyr2 =  controller.SurveyResponseCreation(surveyname, questions2);

        //=============================================================================================================
        //creating a third survey response related to the first survey
        Question thirdqone = new Question("Customer Service");
        Question thirdqtwo = new Question("Cleanliness");

        thirdqone.setAnswer(5);
        thirdqtwo.setAnswer(1);

        //adding question to list
        ArrayList<Question> questions3 = new ArrayList<Question>();
        questions3.add(thirdqone);
        questions3.add(thirdqtwo);

        surveyname = survey.getName();

        //Creating survey response
        SurveyResponse surveyr3 =  controller.SurveyResponseCreation(surveyname, questions3);
        //==============================================================================================================

        //I now have three survey responses, two belonging related to Survey Test, and the other Survey Quality
        ArrayList<SurveyResponse> responses = new ArrayList<>();
        responses.add(surveyr);
        responses.add(surveyr2);
        responses.add(surveyr3);

        //Ensuring the new list of survey responses has just 2 as I am looking for just survey responses related to Survey Test
        assertEquals(2,controller.ReponseSurveyBySurveyName(responses,survey.getName()).size());

        //Ensuring the survey responses in my new list are the correct survey responses
        ArrayList<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(3,5));
        ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(5,1));

        assertEquals(expected1 , controller.ReponseSurveyBySurveyName(responses, survey.getName()).get(0).getIndividualResponses());
        assertEquals(expected2 , controller.ReponseSurveyBySurveyName(responses, survey.getName()).get(1).getIndividualResponses());

    }

    @Test
    public void ReturningListofSurveys()
    {
        //Here I am testing if a user can create multiple surveys

        Survey survey1 = new Survey("first Survey");
        Survey survey2 = new Survey("Second Survey");
        Survey survey3 = new Survey("Third Survey");

        surveys.add(survey1);
        surveys.add(survey2);
        surveys.add(survey3);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("first Survey","Second Survey","Third Survey"));


        assertEquals(3, controller.MultipleSurveys(surveys).size());
        assertEquals(expected, controller.MultipleSurveys(surveys));


    }


    @Test
    public void getAverageForSurveyTest(){

        AutomaticResponseCreation();

        assertEquals(2.75, controller.SurveyAverage(AutomaticResponseCreation()), 1e-3);

    }

    @Test
    public void getSurveySD(){

        AutomaticResponseCreation();

        assertEquals(1.7853, controller.getSurveySD(AutomaticResponseCreation()), 1e-4);

    }

    @Test
    public void getMaxSurvey(){

        AutomaticResponseCreation();

        assertEquals(5, controller.getMaxSurvey(AutomaticResponseCreation()), 1e-1);

    }

    @Test
    public void getMinSurvey(){

        AutomaticResponseCreation();

        assertEquals(1, controller.getMinSurvey(AutomaticResponseCreation()), 1e-3);

    }


    public ArrayList<SurveyResponse> AutomaticResponseCreation()
    {

        //Ensuring that the answers have a value
        ArrayList<Question> questions = new ArrayList<Question>();

        Survey survey = new Survey("Survey Test");
        Question one = new Question("Customer Service");
        Question Two = new Question("Cleanliness");
        one.setAnswer(1);
        Two.setAnswer(4);

        //adding question to list
        questions.add(one);
        questions.add(Two);
        String surveyname = survey.getName();
        SurveyResponse surveyr =  controller.SurveyResponseCreation(surveyname, questions);

        //Creating a 2nd survey response related to a different survey
        //=============================================================================================================

        Survey surveyTwo = new Survey("Survey Quality");
        Question newqone = new Question("Customer Service");
        Question newqtwo = new Question("Cleanliness");

        newqone.setAnswer(4);
        newqtwo.setAnswer(3);

        //adding question to list
        ArrayList<Question> questions2 = new ArrayList<Question>();
        questions2.add(newqone);
        questions2.add(newqtwo);
        surveyname = surveyTwo.getName();
        SurveyResponse surveyr2 =  controller.SurveyResponseCreation(surveyname, questions2);

        //=============================================================================================================
        //creating a third survey response related to the first survey
        Question thirdqone = new Question("Customer Service");
        Question thirdqtwo = new Question("Cleanliness");

        thirdqone.setAnswer(5);
        thirdqtwo.setAnswer(1);

        //adding question to list
        ArrayList<Question> questions3 = new ArrayList<Question>();
        questions3.add(thirdqone);
        questions3.add(thirdqtwo);

        surveyname = survey.getName();

        //Creating survey response
        SurveyResponse surveyr3 =  controller.SurveyResponseCreation(surveyname, questions3);
        //==============================================================================================================

        //I now have three survey responses, two belonging related to Survey Test, and the other Survey Quality
        ArrayList<SurveyResponse> responses = new ArrayList<>();
        responses.add(surveyr);
        responses.add(surveyr2);
        responses.add(surveyr3);

        ArrayList<SurveyResponse>Nameresponses = new ArrayList<>();
        Nameresponses = controller.ReponseSurveyBySurveyName(responses, survey.getName());

        return Nameresponses;
    }




}



