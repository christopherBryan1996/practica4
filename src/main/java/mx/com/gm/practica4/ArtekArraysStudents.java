/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.practica4;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author manci
 */
public class ArtekArraysStudents {

    public String[][] MakeStudentsArray() {
        String[][] students = {
            //name 2name fatherFamily MotherFamily
            {"Irving", "", "Rocha", "Resendiz"},
            {"Luis", "Francisco", "Perez", "Montalvo"},
            {"Ana", "Valeria", "Rivera", "De la O"},
            {"Christopher", "Bryan", "Suarez", "Mancilla"}
        };
        return students;
    }

    public static String[][] OrderByDesc(String[][] alumnos, int pos) {
        Arrays.sort(alumnos, new Comparator<String[]>() {
            public int compare(final String[] entry1, final String[] entry2) {
                if (pos < 1 || pos > entry1.length) {
                    throw new IllegalArgumentException("Posición no válida: " + pos);
                }
                return entry2[pos - 1].compareTo(entry1[pos - 1]);
            }
        });
        return alumnos;
    }

    public static String[][] OrderByAsc(String[][] students, int option) {
        Arrays.sort(students, (a, b) -> a[option - 1].compareTo(b[option - 1]));
        return students;
    }
}
