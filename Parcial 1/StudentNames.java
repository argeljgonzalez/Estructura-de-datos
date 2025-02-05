class StudentsNames {
    public void showStudentsNames() {
        
        String[] studentsNamesArray = {"Rebeca", "Argel", "Leslie", "Jorge", "Rodrigo", "Carlo", "Cesar", "Oscar", "Justin", "Avitia" , "Camila","Christian", "Mario", "Nevarez"}; 

        for (int i = 0; i < studentsNamesArray.length; i++) {
            System.out.println(studentsNamesArray[i]);
        }
        System.out.println("Total Names " + studentsNamesArray.length);
    }
}