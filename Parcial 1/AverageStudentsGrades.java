/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 04-Feb-2025
 */

  /**
 * Genera el promedio de tres calificaciones x estudiante.
 * @param allGradesTotal es la funcion donde .
 * @param studentPromArray es una variable inicializada en cero donde se suman las variaables mediante a un for.
 * @param  averageTotal es la variable donde esta el promedio.
 * @return el promedio 
 */

class AverageStudentsGrades {
    public void averageStudent() {
        int[] allGrdesArray = {55,80,70};
        
        int studentTotal = 0; 

        for (int i=0; i< allGrdesArray.length; i++){
            studentTotal += allGrdesArray[i];

        

        }
        int averageTotal= studentTotal / allGrdesArray.length;

        System.out.println(averageTotal);


        

        
    }
}