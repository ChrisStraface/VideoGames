public class VideoGames {
     String name;
     String platform;
     String releaseDate;

    private VideoGames(String name, String platform, String releaseDate) {
        this.name = name;
        this.platform = platform;
        this.releaseDate = releaseDate;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getPlatform() {
        return platform;
    }

    private void setPlatform(String platform) {
        this.platform = platform;
    }

    private String getReleaseDate() {
        return releaseDate;
    }

    private void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    void describeSelf(){
        System.out.println("I am a video game I have a " + name + ", a " + platform + "and a " + releaseDate);
    }

}
