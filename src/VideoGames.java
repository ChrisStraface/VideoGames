public class VideoGames {
     String name;
     String platform;
     String releaseDate;

    private class VideoGames(String name,String Platform, String releaseDate);

    void describeSelf(){
        System.out.println("I am a video game I have a " + name + ", a " + platform + "and a " + releaseDate);
    }

}
