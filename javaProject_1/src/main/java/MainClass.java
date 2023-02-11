
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("movietitle.txt");
        Scanner fileScanner = new Scanner(file);
        String line = " ";
        int counter = 0, counter1 = 0;

         while(fileScanner.hasNext()) {
             counter = counter + 1;
             line = fileScanner.nextLine();
         }

         Scanner fileScanner1 = new Scanner(file);
         String line1 = " ";
         int wordscounter1 = 0;
         counter = (int)(Math.random() * counter) + 1;

        while(fileScanner1.hasNext()) {
            counter1 = counter1 + 1;
            line1 = fileScanner1.nextLine();

            if(counter == counter1) {
                    wordscounter1 = line1.length();
                break;
            }
        }
        //System.out.println(line1);
        Game game = new Game(wordscounter1, line1);
    }

}
