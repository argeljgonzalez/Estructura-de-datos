/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 11-Feb-2025
 */

/**
 * Calcula las calificaciones del primer parcial.
 * @function calculateFirstParcialGrades Esta función calcula la calificación del primer parcial
 * usando las calificaciones del examen y las tareas.
 * @param examScore Es la calificación del examen.
 * @param homeworkScore Es la calificación de las tareas.
 * @return Devuelve la calificación del primer parcial como un número entero.
 */

 /**
 * Calcula la calificación final del alumno.
 * @function calculateFinalGrades Esta función calcula la calificación final
 * promediando los parciales y el examen final.
 * @param firstParcial La calificación del primer parcial.
 * @param secondParcial La calificación del segundo parcial.
 * @param thirdParcial La calificación del tercer parcial.
 * @param finalExam La calificación del examen final.
 * @return Devuelve la calificación final del alumno como un número entero.
 */

/**
 * Verifica si el alumno cumple con las asistencias requeridas.
 * @function checkFailureByAbsences Esta función calcula el porcentaje de ausencias
 * y verifica si el alumno cumple con el límite del 10% de ausencias.
 * @param totalHours El total de horas del curso.
 * @param absences El número de ausencias del alumno.
 * @return Devuelve un mensaje indicando si el alumno cumple o no con las asistencias requeridas.
 */

public class StudentsGrades {
    public  int calculateFirstParcialGrdaes(int examScore, int homeworkScore){
        double firstParcialGrade = (examScore * 0.7) + (homeworkScore*.3);
        return (int) firstParcialGrade;


        
    }

    public int calculateFinalGrdaes(int firstParcial, int secondParcial, int thirdParcial, int finalExam){
        double everyGrades =(((firstParcial + secondParcial + thirdParcial))/ 3)*.50 + (finalExam * .50);
        return (int) everyGrades;
        
    }

    public String checkFailureByAbsences(int totalHours, int absences){
        double absencesCalculate=((double)absences/(double)totalHours)*100;
         
        if (absencesCalculate<10.0){
            return "El alumno si cumple con las asistencias";
        } else {
            return"El alumno no cumple con las asitencias";
        }

   
    }
    
}
