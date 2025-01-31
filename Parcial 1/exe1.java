class Exe1 {
    public void average() {
        int[] StudentPromarray = {55,80,70};
        
        int StudentTotalarray = 0; 

        for (int i=0; i< StudentPromarray.length; i++){
            StudentTotalarray += StudentPromarray[i];

        

        }
        int TotalFinarray = StudentTotalarray / StudentPromarray.length;

        System.out.println(TotalFinarray);


        

        
    }
}