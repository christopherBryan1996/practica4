/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mx.com.gm.practica4;

/**
 *
 * @author manci
 */
public class Practica4 {

    public static void main(String[] args) {

        int option = 1;
        switch (option) {
            case 0:
                //TODO Display Random numbers results
                ArtekArrays number = new ArtekArrays();
                int[] numbers = number.MakeRandomNumbers();
                int i = 1;

                System.err.println("Numeros Random");
                for (int numberRam : numbers) {
                    System.err.println("Posicion " + i + ": valor: " + numberRam);
                    i++;
                }

                System.err.println("\nPomedio: " + number.AvarageNumbers(numbers));

                System.err.println("\nMediana: " + number.MedianaNumber(numbers));

                System.err.println("\nModa: " + number.ModaNumber(numbers));

                int[] numberOrderByDesc = number.OrderByDesc(numbers);

                System.err.println("\nOrdenado desendente");
                for (int numberRam : numberOrderByDesc) {
                    System.err.println("Posicion " + i + ": valor: " + numberRam);
                    i--;
                }

                int[] numberOrderByAsc = number.OrderAsc(numbers);

                System.err.println("\nOrdenado asendente");
                for (int numberRam : numberOrderByAsc) {
                    System.err.println("Posicion " + i + ": valor: " + numberRam);
                    i++;
                }

                int[] numberInpar = number.InparNumbers(numbers);

                System.err.println("\nNumeros Inpares");
                for (int numberRam : numberInpar) {
                    System.err.println("Valor: " + numberRam);
                }

                int[] numberPar = number.ParNumbers(numbers);

                System.err.println("\nNumeros pares");
                for (int numberRam : numberPar) {
                    System.err.println("Valor: " + numberRam);
                }

                int[] numberInparPosi = number.InparPositionNumber(numbers);

                System.err.println("\nPosiciones de los impares");
                for (int numberRam : numberInparPosi) {
                    System.err.println("Posicion: " + numberRam);
                }

                int[] numberParPosi = number.ParPositionNumber(numbers);

                System.err.println("\nPosiciones de los pares");
                for (int numberRam : numberParPosi) {
                    System.err.println("Posicion: " + numberRam);
                }
                break;
            case 1:
                //TODO Display Students results;
                ArtekArraysStudents students = new ArtekArraysStudents();

                String[][] studentsA = students.MakeStudentsArray();
                
                for(String[] student: students.OrderByDesc(studentsA, 1)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByDesc(studentsA, 2)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByDesc(studentsA, 3)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByDesc(studentsA, 4)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                
                for(String[] student: students.OrderByAsc(studentsA, 1)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByAsc(studentsA, 2)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByAsc(studentsA, 3)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(String[] student: students.OrderByAsc(studentsA, 4)){
                    for(String detalle : student){
                        System.out.print(detalle+ " ");
                    }
                    System.out.println("");
                }
                break;
        }
    }

}
