/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 04-Feb-2025
 */

  /**
 * Randomiza tres elementos de un arreglo.
 * @param gameElementsArray es el arreglo.
 * @param randomize es un objeto de la clase Random.
 * @param finalGameRandom es una variable que guarda el elemento randomizado.
 * @return el eleemnto randomizado
 */

import java.util.Random;

class  KidsGame {
    public void gameElementsRandomize(){
        String[] gameElementsArray = {"rock", "paper", "sissors"};

        Random randomize=  new Random();

        String finalGameRandom = gameElementsArray[randomize.nextInt(gameElementsArray.length)];

        System.out.println(finalGameRandom);
        

        
    }
}