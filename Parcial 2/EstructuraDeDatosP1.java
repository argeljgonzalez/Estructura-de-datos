public class EstructuraDeDatosP1 {
    public static void main(String args[]) {

        int peorCaso[] = { 10,9,8,7,6,5, 4, 3, 2, 1};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = InsertionSort.insertionSort(peorCaso);
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        int worstCase[] = {10,9,8,7,6,5, 4, 3, 2, 1}; 

        System.out.println("Peor Caso:");
        int worstComparisons = SelectionSort.selectionSort(worstCase);
        System.out.println("\nTotal de comparaciones: " + worstComparisons);

        int horribleCase[] = {10,9,8,7,6,5, 4, 3, 2, 1}; 

        System.out.println("Peor Caso:");
        int horribleComparision = BubbleSort.bubbleSort(horribleCase);
        System.out.println("\nTotal de comparaciones: " + horribleComparision);

        Secuential objSecuential = new Secuential();
        int number = objSecuential.searchNumber(10);
        System.out.println(number);


    }
}