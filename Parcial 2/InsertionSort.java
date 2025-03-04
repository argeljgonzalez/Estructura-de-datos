public class InsertionSort {

    int [] array = {8,6,1,2,5};

    public void sort () {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i-1;

            while (j>= 0 && array [j]> key){
                array[j+1]=array [j];
                j--;
            }
            array [j + i]=key;
        }
    }

    
}