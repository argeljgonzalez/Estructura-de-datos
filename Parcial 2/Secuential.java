public class Secuential {

    public  int searchNumber (int num) {

        int [] randomNumbers= { 10,9,8,7,6,5, 4, 3, 2, 1};


       for (int index = 0; index < randomNumbers.length; index++) {
            if (num==randomNumbers[index]){
                return index;

            }
        
       }
       return -1;
            

            
            
        

        
        
    }
    
}
