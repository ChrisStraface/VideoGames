import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    public String toString()
    {
        return name + ", " + platform + ", " + releaseDate + ", " + developer + ", " + publisher + ", " + series + ", " + sells;
    }

    void describeSelf() {
        System.out.println(name + ", " + platform + ", " + releaseDate + ", " + developer + ", " + publisher + ", " + series + ", " + sells);
    }
    static void readAllData() {
        Scanner sc = null;
        try{
            File file = new File("src/Video game sales data");
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                while (lineScanner.hasNext()) {
                    String chunkOfData = lineScanner.next();
                    System.out.println(chunkOfData);
                }
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }
    }
}

