import java.util.ArrayList;

public class SurveyResponse {

    ArrayList<Question> questions = new ArrayList<Question>();
    String surveyname;

    //Questions from the survey
    public SurveyResponse(String surveyname, ArrayList<Question> questions)
    {
        this.surveyname = surveyname;
        this.questions = questions;
    }

    //here I can create a list of answers based on questions forming reponses
    public ArrayList<Integer> getIndividualResponses()
    {
        //represents the responses, as responses will be a number
        ArrayList<Integer> responses = new ArrayList<Integer>();


        for(Question q : this.questions)
        {
            int value = q.getAnswer();
            responses.add(value);
        }


        return responses;
    }





}