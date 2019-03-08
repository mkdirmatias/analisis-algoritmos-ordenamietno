/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author unkndown
 */
public class Algoritmos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // iteraciones
        int iteraciones = 50;
        
        // Tamaño vector
        int n = 1000000;
        
        // Calse Utilidades del proyecto
        Utilidades utilidades = new Utilidades();
        
        // Tiempo de inicio
        long inicio = utilidades.tiempoTranscurrido(0,0);
        
        // ciclo for de 50 iteraciones
        for(int i=0;i<iteraciones;i++)
        {
        
            // Generamos el Array
            int evaluar[] = utilidades.GenerarVector(n);

            // ordenamos
            AlgoritmosClass algoritmos = new AlgoritmosClass();
            
            /**
            * Descomentar linea de algoritmo a ejecutar
            */
            //algoritmos.bubbleSort(evaluar);
            //algoritmos.InsertionSort(evaluar);
            //algoritmos.SelectionSort(evaluar);
            algoritmos.CountingSort(evaluar);
            //algoritmos.QuickSort(evaluar,0,n-1);
            //algoritmos.MergeSort(evaluar,0,n-1);
        }  
        
        
        // Tiempo transcurrido
        long transcurrido = utilidades.tiempoTranscurrido(1,inicio);
        System.out.println("\n Tiempo Transcurrido: " + transcurrido + " segundos");
        
        // Tiempo Promedio
        float promedio = (float)transcurrido/iteraciones;
        System.out.println("\n Tiempo Promedio: " + promedio + " segundos");
    }
    
}
