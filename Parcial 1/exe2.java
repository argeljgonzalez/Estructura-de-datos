import java.util.Random;

class  Exe2 {
    public void game(){
        String[] videogame = {"rock", "paper", "sissors"};

        Random randomize=  new Random();

        String FinalgameArray = videogame[randomize.nextInt(videogame.length)];

        System.out.println(FinalgameArray);
        

        
    }
}