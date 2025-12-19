public class Exam {
    private String subject;
    private Question question;

    public Exam(String subject, Question question) {
        this.subject = subject;
        this.question = question;
    }

    public String getSubject() {
        return subject;
    }

    public Question getQuestion() {
        return question;
    }

    public void conductExam(Candidate candidate, String answer) {
        if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
            candidate.addScore(question.getScore());
            System.out.println(candidate.getName() + ": Correct answer!");
        } else {
            System.out.println(candidate.getName() + ": Wrong answer.");
        }
    }
}

