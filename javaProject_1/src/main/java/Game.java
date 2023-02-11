import java.util.Scanner;

public class Game {
    int wordscounter1,index, winLimit= 0,lostLimit = 0;
    String line1;

    Scanner scanner1 = new Scanner(System.in);


    public Game(int wordscounter1, String line1) {
        this.wordscounter1 = wordscounter1;
        this.line1 = line1;

        char rakib[] = new char[wordscounter1];
        char rakib1[] = new char[40];
        rakib1[0] = ' ';
        int pointLimit = 0;

        for(int i =0; i < wordscounter1; i++) {
            if(line1.charAt(i) == ' ') {
                rakib[i] = '-';
                winLimit++;
            } else {
                rakib[i] = '-';
            }
        }

        char guessChar = ' ';
        while(pointLimit < 10) {

            System.out.print("you are guessing:");
            System.out.println(rakib);
            System.out.print("you have guessed (" + pointLimit + ") wrong letters:");
            System.out.println(rakib1);
            System.out.print("Guess a letter:");

            guessChar = scanner1.next().charAt(0);
            index = line1.indexOf(guessChar);

            if(index >= 0) {

                for (int i = 0; i < wordscounter1; i++) {
                    if (guessChar == line1.charAt(i)) {
                        rakib[i] = guessChar;
                       winLimit++;
                    }
                }

                if(winLimit == wordscounter1) {
                    System.out.println("you win!!");
                    break;
                }

            } else {
                    pointLimit = pointLimit + 1;
                    rakib1[lostLimit] = guessChar;
                    lostLimit = lostLimit + 1;
                    rakib1[lostLimit] = ' ';
                    lostLimit = lostLimit + 1;

                    if (pointLimit == 10) {
                        System.out.println("you lost");
                        break;
                    }
                }
            }

       }

   }


