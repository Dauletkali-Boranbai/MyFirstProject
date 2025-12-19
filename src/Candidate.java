public class Candidate {
    private String name;
    private int id;
    private int totalScore;

    public Candidate(String name, int id) {
        this.name = name;
        this.id = id;
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addScore(int score) {
        this.totalScore += score;
    }

    public void printCandidate() {
        System.out.println("Candidate: " + name + "\n" + "ID: " + id + "\n" + "Score: " + totalScore);
    }
}

