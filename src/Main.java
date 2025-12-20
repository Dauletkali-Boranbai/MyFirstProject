public class Main {
    public static void main(String[] args) {

        Question q1 = new Question(
                "What is the capital of Kazakhstan?",
                "Astana",
                10
        );

        Candidate c1 = new Candidate("Ali", 1);
        Candidate c2 = new Candidate("Sultan", 2);

        Exam exam = new Exam("Geography", q1);

        q1.printQuestion();

        exam.conductExam(c1, "Astana");
        exam.conductExam(c2, "Almaty");

        c1.printCandidate();
        c2.printCandidate();


        if (c1.getTotalScore() > c2.getTotalScore()) {
            System.out.println(c1.getName() + " scored higher than " + c2.getName());
        } else if (c1.getTotalScore() < c2.getTotalScore()) {
            System.out.println(c2.getName() + " scored higher than " + c1.getName());
        } else {
            System.out.println("Both candidates have equal scores");
        }
    }
}
