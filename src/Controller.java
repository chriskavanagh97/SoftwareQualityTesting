import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public ArrayList<String> MultipleSurveys(ArrayList<Survey>surveys) {

        ArrayList<String> surveynames = new ArrayList<>();
        //returning the list of surveys so I can test for size to ensure multiple surveys can be made
        for(Survey survey: surveys)
        {
            surveynames.add(survey.getName());

        }

        return surveynames;

    }

    //Creating a survey with multiple questions
    public Survey SurveyMultipleQuestions(String surveyname,  ArrayList<Question> questions )
    {
        //creating a new survey with the name and list of questions
        Survey createSurvey = new Survey(surveyname, questions);

        return createSurvey;
    }

    public Question questionAnswer(Question questionAnswer, int answer)
    {
        //Setting the value of the answer
        questionAnswer.setAnswer(answer);
        return questionAnswer;
    }

    public SurveyResponse SurveyResponseCreation(String surveyname, ArrayList<Question> questions  )
    {
        //creating a new survey object
        SurveyResponse firstSurveyResponse = new SurveyResponse(surveyname,questions);

        return firstSurveyResponse;


    }

    public ArrayList<SurveyResponse> surveyResponse(ArrayList<SurveyResponse> surveyResponse)
    {
        //Get the first survey response and the corresponding answers in the object
        return surveyResponse;

    }

    public Survey getSurveybyName(ArrayList<Survey> surveys , String name)
    {
        Survey surveyReturned = new Survey("Survey");
        for(Survey survey: surveys)
        {
            if(survey.getName().equals(name))
            {
                surveyReturned= survey;
            }

        }
        return surveyReturned;
    }

    public ArrayList<SurveyResponse> ReponseSurveyBySurveyName(ArrayList<SurveyResponse> responses , String name)
    {

        ArrayList<SurveyResponse> targetresponses = new ArrayList<>();
        for(SurveyResponse CurrentsurveyResponse: responses)
        {
            if(CurrentsurveyResponse.getSurveyname().equals(name))
            {
                targetresponses.add(CurrentsurveyResponse);
            }

        }
        return targetresponses;
    }

    public ArrayList<Integer> SurveyResponseByQuestion(ArrayList<SurveyResponse> responses, String questionname )
    {

        ArrayList<Integer> targetresponses = new ArrayList<>();

        for(SurveyResponse CurrentsurveyResponse: responses)
        {
            for(Question question : CurrentsurveyResponse.getQuestions()){



                    if(question.getQuestion().equals(questionname))
                    {
                        targetresponses.add(question.getAnswer());

                    }
            }

        }
        return targetresponses;
    }



    public double SurveyAverage(ArrayList<SurveyResponse>responses){

        double total = 0;
        int size = 0;

        for(SurveyResponse reponse : responses)
        {

            for(int i : reponse.getIndividualResponses()){

                total += i;
                size += 1;

            }
        }
        return total/size;
    }

    public double getSurveySD(ArrayList<SurveyResponse>responses){

        ArrayList<Integer> responselist = new ArrayList<>();

        double total = 0;
        int size = 0;

        double standardDeviation = 0.0;


        for(SurveyResponse surveyResponse : responses)
        {
            for(int i : surveyResponse.getIndividualResponses()){

                total += i;
                size += 1;
                responselist.add(i);
            }
        }


        double mean = total/size;

        for(double num: responselist) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/size);
    }

    public int getMinSurvey(ArrayList<SurveyResponse>responses){


        ArrayList<Integer> responselist = new ArrayList<>();

        int minnum = 0;



        for(SurveyResponse surveyResponse : responses)
        {
            for(int i : surveyResponse.getIndividualResponses()){

                responselist.add(i);
            }
        }
        minnum = Collections.min(responselist);



        return minnum;

    }

    public int getMaxSurvey(ArrayList<SurveyResponse>responses){

        ArrayList<Integer> responselist = new ArrayList<>();

        int maxnum = 0;



        for(SurveyResponse surveyResponse : responses)
        {
            for(int i : surveyResponse.getIndividualResponses()){

                responselist.add(i);
            }
        }
        maxnum = Collections.max(responselist);

        return maxnum;
    }

    public double getQuestionAverage(ArrayList<Integer>responses){

        double total = 0;
        int size = 0;


            for(int i : responses){

                total += i;
                size += 1;

            }

        return total/size;
    }

    public double getQuestionSD(ArrayList<Integer>responses){

        ArrayList<Integer> responselist = new ArrayList<>();

        double total = 0;
        int size = 0;

        double standardDeviation = 0.0;



            for(int i : responses){

                total += i;
                size += 1;
                responselist.add(i);
            }



        double mean = total/size;

        for(double num: responselist) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/size);
    }

    public int getMinQuestion(ArrayList<Integer>responses){


        ArrayList<Integer> responselist = new ArrayList<>();

        int minnum = 0;




            for(int i : responses){

                responselist.add(i);
            }

        minnum = Collections.min(responselist);



        return minnum;

    }

    public int getMaxQuestion(ArrayList<Integer>responses){

        ArrayList<Integer> responselist = new ArrayList<>();

        int maxnum = 0;




            for(int i : responses){

                responselist.add(i);
            }

        maxnum = Collections.max(responselist);

        return maxnum;
    }


}
