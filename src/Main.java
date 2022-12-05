import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new VideoGameScore("The Legend of Zelda: Ocarina of Time", "N64", "November 23, 1998", 1, 99);
        new VideogamesSells("Minecraft","Multiplatform","November 18, 2011", "Mojand Studios", "Xbox Game studios", "Minecraft", 238000000);
        for(VideoGames game: VideoGames.getAllVideoGames()) {
           System.out.println(game);

       }
    }

}

