package adm.ailatrieuphu.model;

/**
 * Created by Thanggun99 on 29/10/2016.
 */
public class HighScore {
    String name;
    int score;

    public HighScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
