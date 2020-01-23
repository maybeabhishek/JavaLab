import java.io.*;
import java.util.Scanner;

abstract class Themepark{
    int adultFee = 500;
    int childFee = 300;

    float totalCost(int adult, int children){
        return adultFee*adult + childFee*children;
    }

    abstract void playGame(int gameCode);
}

class Queensland extends Themepark {
    Boolean[] games = new Boolean[30];
    public int playCount;

    Queensland() {
        for(int i = 0; i<30; i++)
            games[i] = false;
        playCount = 0;
    }

    @Override
    void playGame(int gameCode){
        if(games[gameCode] == true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Game already done, enter another game code: ");
            gameCode = s.nextInt();

            if(games[gameCode] == true)
                return;
        }
        games[gameCode] = true;
        playCount++;
    }
}

class Wonderla extends Themepark {
    Integer[] games = new Integer[40];

    Wonderla() {
        for( int i =0; i<40; i++){
            games[i] = 0;
        }
    }

    @Override
    void playGame(int gameCode){
        games[gameCode]++;
    }

    int getGamesRepeated() {
        int count = 0;
        for( int i=0; i<games.length; i++){
            if(games[i] > i)
                count++;
        }
        return count;
    }

    int getGamesNotPlayed(){
        int count = 0;
        for(int i =0; i < games.length; i++ )
            if(games[i] == 0)
                count++;
        return count;
    }
}

class q3{
    public static void main(String[] args){
        int choice, gameCode;
        System.out.println("Choose your amusement park:\n1. Queensland\n2. Wonderla\nEnter: ");

        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        if(choice == 1){
            Queensland park = new Queensland();
            do {
                System.out.println("Enter gamecode to play (-1 to exit): ");
                gameCode = s.nextInt();
                if(gameCode == -1) {
                    System.out.println("Total number of games played: " + park.playCount);
                    return;
                }
                park.playGame(gameCode);
            } while (gameCode != 1);
        }
        else{
            Wonderla park = new Wonderla();
            do {
                System.out.println("Enter gamecode to play (-1 to exit): ");
                gameCode = s.nextInt();

                if( gameCode == -1){
                    System.out.println("Total number of games repeated: "+ park.getGamesRepeated());
                    System.out.println("Total number of games not played: "+ park.getGamesNotPlayed());
                    return;
                }

                park.playGame(gameCode);
            } while(gameCode != -1);
        }
    }
}