import java.util.Random;

class  Game {
    public static void main(String[] args){
        String[] videogame = {"rock", "paper", "sissors"};

        Random randomize=  new Random();

        String FinalgameArray = videogame[randomize.nextInt(videogame.length)];

        System.out.println(FinalgameArray);
        

        
    }
}