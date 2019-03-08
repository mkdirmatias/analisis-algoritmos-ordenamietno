/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Utilidades
{
    /**
     * Imprimir array de tamaño n
     * @param arr 
     */
    static void mostrarArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    
    
    
    /**
     * Generar un array de valores aleatorios de tamaño n
     * @param n tamaño del array
     * @return 
     */
    public static int[] GenerarVector(int n)
    {
        int v[] = new int[n];
        for(int i=0; i < n; i++)
        {
            // la variable numeroo, generará un numero aleatorio entre el 1 y 1000
            int numero = (int)(Math.random() * 1000) + 1; 
            v[i]=numero;
        }
        
        return v;
    }
    
    
    /**
     * Devolver tiempo actual o tiempo transcurrido
     * @param metodo 0 si devuelve tiempo actual y 1 para restar dos tiempos diferentes
     * @param tiempo 0 si devuelve tiempo actual y un tiempo para restar
     * @return 
     */
    public static long tiempoTranscurrido(int metodo, long tiempo)
    {
        long Final = System.nanoTime();
        
        if(metodo==1)
        {
            Final = ((tiempo-Final)/1000000000)*-1;
        }
        
        return Final;
    }
}
