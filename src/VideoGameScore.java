public class VideoGameScore extends VideoGames {

    private int rank;
    private int score;

    VideoGameScore(String name, String platform, String releaseDate, int rank, int score) {
        super(name, platform, releaseDate);
        this.rank = rank;
        this.score = score;
    }

    private int getRank() {
        return rank;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    private int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public String toString()
    {
        return name + ", " + platform + ", " + releaseDate + ", ranked" + rank + ", score of " + score;
    }

    void describeSelf() {
        System.out.println(name + ", " + platform + ", " + releaseDate + ", ranked " + rank + ", score of " + score);
    }
}
