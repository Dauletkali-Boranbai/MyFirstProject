public class Question {
    private String text;
    private String correctAnswer;
    private int score;

    public Question(String text, String correctAnswer, int score) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.score = score;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void printQuestion() {
        System.out.println("Question: " + text + "\n" + "Score: " + score);
    }
}


