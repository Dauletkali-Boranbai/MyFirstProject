import java.util.*;

public class Main {
    public static void main(String[] args) {
        Candidate c1 = new Candidate("Ali");
        Candidate c2 = new Candidate("Dana");


        Question q1 = new SingleChoiceQuestion("2 + 2 = ?", "4", 5);
        Question q2 = new MultipleChoiceQuestion(
                "Select programming languages",
                Arrays.asList("Java", "Python"),
                5
        );


        Exam exam = new Exam();
        exam.addQuestion(q1);
        exam.addQuestion(q2);


        Map<Question, List<String>> a1 = new HashMap<>();
        a1.put(q1, List.of("4"));
        a1.put(q2, List.of("Java", "Python"));


        Map<Question, List<String>> a2 = new HashMap<>();
        a2.put(q1, List.of("3"));
        a2.put(q2, List.of("Java"));


        exam.conductExam(c1, a1);
        exam.conductExam(c2, a2);


        System.out.println("Results:");
        exam.printResultsSorted();


        System.out.println("Passed candidates: " + exam.getPassed(5));
    }
}
