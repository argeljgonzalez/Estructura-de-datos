/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 18-Feb-2025
 */

 /**
 * Cuenta la cantidad de números pares, impares y ceros en un arreglo.
 * @function oddOrEvenCalculator Esta función analiza un conjunto de números enteros
 * y determina cuántos son pares, cuántos impares y cuántos son ceros.
 * @param numberArray El arreglo de números enteros a analizar.
 * @return No devuelve ningún valor, pero imprime los resultados en la consola.
 */

public class ExerciseNumberType {
    public void  oddOrEvenCalculator (){
        int[] numberArray = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
            }; 

        int even = 0;
        int odd = 0;
        int zeros= 0;
         
        for (int numbers : numberArray){
            if (numbers==0){
                zeros++; 
            }
            else if (numbers% 2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total de numeros pares"+ even);
        System.out.println("Total de numeros impares"+ odd);
        System.out.println("Total de numeros de ceros" + zeros);

        

        

    
    }
}


    



    

