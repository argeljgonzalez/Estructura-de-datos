/**
 * Autor: Argel Jhamir Gonzalez Ontiveros
 * Matrícula: 14571
 * Fecha: 04-Feb-2025
 */

   /**
 * Muestra una lista de todos los nombres de un salon.
 * @param showStudentsNames es la funcion donde se ralizara el show de la lista.
 * @param studentsNamesArray es la variable donde guarda el arrgelo con todos los nombres de los mismos.
 * @return los nombres de todos se muestran y te muestra el total del mismo con @param .length
 */

class StudentsNames {
    public void showStudentsNames() {
        
        String[] studentsNamesArray = {"Rebeca", "Argel", "Leslie", "Jorge", "Rodrigo", "Carlo", "Cesar", "Oscar", "Justin", "Avitia" , "Camila","Christian", "Mario", "Nevarez"}; 

        for (int i = 0; i < studentsNamesArray.length; i++) {
            System.out.println(studentsNamesArray[i]);
        }
        System.out.println("Total Names " + studentsNamesArray.length);
    }
}