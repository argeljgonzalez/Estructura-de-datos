/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 04-Feb-2025
 */


public class Estructuradatos {
    public static void main(String[] args) {

        AverageStudentsGrades objaAverageStudentsGrades = new AverageStudentsGrades();
        objaAverageStudentsGrades.averageStudent();

        KidsGame objkKidsGame = new KidsGame();
        objkKidsGame.gameElementsRandomize();

        StudentsNames objStudentsNames = new StudentsNames();
        objStudentsNames.showStudentsNames();

        UserData objUserData = new UserData();

        String fullName =objUserData.fullName("Argel", "Lima");
        System.out.println(fullName);


    }
    
}
