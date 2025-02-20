import java.util.Scanner;

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

        StudentsGrades objStudentsGrades = new StudentsGrades();

        int grade = objStudentsGrades.calculateFirstParcialGrdaes(85, 90);
        System.out.println("la calificacion parcial es: " + grade);

        int totalGrades = objStudentsGrades.calculateFinalGrdaes(80, 75, 90, 85);
        System.out.println("la calificacion final es: " + totalGrades);

        String attendanceStatus =objStudentsGrades.checkFailureByAbsences(64, 7);
        System.out.println(attendanceStatus);

        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");
        double base =objScanner.nextDouble();

        System.out.println("Ingresa la altura del triangulo: ");
        double height= objScanner.nextDouble();

        TriangleArea objTriangleArea = new TriangleArea();
        double area = objTriangleArea.areaCalculate(base, height);

        System.out.println(area);
         
        objScanner.close();

        MultiDimensionalArray objMultiDimensionalArray = new MultiDimensionalArray();
        objMultiDimensionalArray.printDimensionalArray();

        Scanner objScanner1Scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double radio =objScanner.nextDouble();

        CircleArea objCircleArea = new CircleArea();
        double area2 = objCircleArea.areaCalculator(radio);

        System.out.println(area2);
         
        objScanner1Scanner.close();

        ExerciseNumberType objExerciseNumberType = new ExerciseNumberType();
        objExerciseNumberType.oddOrEvenCalculator();




    }
    
}
