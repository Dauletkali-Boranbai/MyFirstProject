import java.util.*;

class Exam {
    private List<Question> questions = new ArrayList<>();
    private Map<Candidate, Integer> results = new HashMap<>();


    public void addQuestion(Question q) {
        questions.add(q);
    }


    public void conductExam(Candidate candidate, Map<Question, List<String>> answers) {
        int score = 0;
        for (Question q : questions) {
            if (q.checkAnswer(answers.get(q))) {
                score += q.getPoints();
            }
        }
        results.put(candidate, score);
    }


    // Filtering
    public List<Candidate> getPassed(int minScore) {
        List<Candidate> passed = new ArrayList<>();
        for (Candidate c : results.keySet()) {
            if (results.get(c) >= minScore) {
                passed.add(c);
            }
        }
        return passed;
    }


    // Sorting
    public void printResultsSorted() {
        results.entrySet().stream()
                .sorted(Map.Entry.<Candidate, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey().getName() + ": " + e.getValue()));
    }
}

