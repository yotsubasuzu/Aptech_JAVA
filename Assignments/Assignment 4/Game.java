abstract class Game {
    protected String numGame, performance, grade;

    public String getNumGame() {
        return numGame;
    }
    public void setNumGame(String numGame) {
        this.numGame = numGame;
    }
    public String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    abstract double calculateIncome(String numGame);
    abstract double calculateBonus(String performance, String grade);
}
