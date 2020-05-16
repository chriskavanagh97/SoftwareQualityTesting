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
        this.answer = answer;
    }
}