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

}
