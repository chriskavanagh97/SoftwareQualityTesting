public class Question {

    //values for Question
    private String question;
    private int answer;


    //Question constructor
    public Question(String question) {

        if (question.equalsIgnoreCase("")) {

            throw new IllegalArgumentException("Question must have a name" );

        }
        else {


            this.question = question;
        }

    }

    //Getter and setter for question
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        //I am adding in validation for question answers
        if(answer < 1 || answer > 5)
        {
            throw new IllegalArgumentException("Your must answer with a value between 1 and 5 " + answer );
        }
        //If the answer is between 1 and 5 it will be set as normal
        else
        {
            this.answer = answer;
        }
    }
}