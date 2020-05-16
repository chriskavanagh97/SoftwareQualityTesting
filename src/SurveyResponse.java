import java.util.ArrayList;

public class SurveyResponse {

    ArrayList<Question> questions = new ArrayList<Question>();

    //Questions from the survey
    public SurveyResponse(ArrayList<Question> questions)
    {
        this.questions = questions;
    }

    //here I can create a list of answers based on questions forming reponses
    public ArrayList<Integer> getResponses()
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