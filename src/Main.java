import java.util.ArrayList;

public class Main {
    private static void main(String[] args) {
        ArrayList<VideoGames> allVideoGames = new ArrayList<>();
        VideoGames Minecraft = new VideoGames("Minecraft", "multiplatform", "November 18, 2011");
        allVideoGames.add(Minecraft);
        Minecraft.describeSelf();
    }
}