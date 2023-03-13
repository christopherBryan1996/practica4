/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.practica4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author manci
 */
public class ArtekArrays {

    public int[] MakeRandomNumbers() {
        int[] numbers = new int[100];
        //TODO make random numbers from 1 to 50 inclusive 1 and 50;
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 50 + 1);
        }
        return numbers;
    }

    public float AvarageNumbers(int[] numbers) {
        float avarage = 0f;
        for (int number : numbers) {
            avarage += number;
        }
        avarage = avarage / numbers.length;
        return avarage;
    }

    public int MedianaNumber(int[] numbers) {
        int mediana = 0;
        //TODO get media; 
        Arrays.sort(numbers);
        int mitad = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            mediana = (numbers[mitad - 1] + numbers[mitad]) / 2;
        } else {
            mediana = numbers[mitad];
        }
        return mediana;
    }

    public int ModaNumber(int[] numbers) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        int moda = numbers[0];
        for (int num : numbers) {
            if (!frecuencia.containsKey(num)) {
                frecuencia.put(num, 1);
            } else {
                frecuencia.put(num, frecuencia.get(num) + 1);
            }
            if (frecuencia.get(num) > frecuencia.get(moda)) {
                moda = num;
            }
        }
        return moda;
    }

    public int[] OrderByDesc(int[] numbers) {

        Integer[] numerosObj = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numerosObj[i] = numbers[i];
        }

        Arrays.sort(numerosObj, Comparator.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numerosObj[i];
        }

        return numbers;
    }

    public int[] OrderAsc(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public int[] InparNumbers(int[] numbers) {
        int[] impares = new int[numbers.length];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                impares[index++] = num;
            }
        }
        return Arrays.copyOfRange(impares, 0, index);
    }

    public int[] ParNumbers(int[] numbers) {
        int[] impares = new int[numbers.length];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                impares[index++] = num;
            }
        }
        return Arrays.copyOfRange(impares, 0, index);
    }

    public int[] InparPositionNumber(int[] numbers) {
        int[] posicionesPares = new int[numbers.length]; 
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) { 
                posicionesPares[j] = i+1; 
                j++;
            }
        }
        return Arrays.copyOf(posicionesPares, j);
    }

    public int[] ParPositionNumber(int[] numbers) {
        int[] posicionesPares = new int[numbers.length]; 
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { 
                posicionesPares[j] = i+1; 
                j++;
            }
        }
        return Arrays.copyOf(posicionesPares, j);
    }

}
