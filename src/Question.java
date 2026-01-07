import java.util.*;

abstract class Question {
    protected String text;
    protected int points;

    public Question(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public abstract boolean checkAnswer(List<String> answers);

    @Override
    public String toString() {
        return text + " (" + points + " points)";
    }
}

