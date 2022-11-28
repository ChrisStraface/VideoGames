public class VideogamesSells extends VideoGames {


    String developer;
    String publisher;
    String series;
    int sells;
    public VideogamesSells(String name, String platform, String releaseDate, String developer, String publisher, String series, int sells) {
        super(name, platform, releaseDate);
        this.developer = developer;
        this.publisher = publisher;
        this.series = series;
        this.sells = sells;
    }

    private String getDeveloper() {
        return developer;
    }

    private void setDeveloper(String developer) {
        this.developer = developer;
    }

    private String getPublisher() {
        return publisher;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private  String getSeries() {
        return series;
    }

    private void setSeries(String series) {
        this.series = series;
    }

    private int getSells() {
        return sells;
    }

    private void setSells(int sells) {
        this.sells = sells;
    }
}

