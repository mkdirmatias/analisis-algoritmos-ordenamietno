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
public class AlgoritmosClass
{
    /**
     * InsertioSort
     * @param arr Array a ordenar
     */
    void InsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    
    
    /**
     * BubbleSort
     * @param arr 
     */
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
    
    
    
    /**
     * QuickSort
     * @return 
     */
    int particionQuickSort(int arr[], int menor, int mayor) 
    { 
        int pivot = arr[mayor];  
        int i = (menor-1);
        for (int j=menor; j<mayor; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
 
        int temp = arr[i+1]; 
        arr[i+1] = arr[mayor]; 
        arr[mayor] = temp; 
  
        return i+1; 
    }
    void QuickSort(int arr[], int menor, int mayor) 
    { 
        if (menor < mayor) 
        { 
            int pi = particionQuickSort(arr, menor, mayor); 
  
            QuickSort(arr, menor, pi-1); 
            QuickSort(arr, pi+1, mayor); 
        } 
    }
    
    
    
    /**
     * MergeSort
     */
    void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
    void MergeSort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
  
            MergeSort(arr, l, m); 
            MergeSort(arr , m+1, r); 
  
            merge(arr, l, m, r); 
        } 
    }
    
    
    
    /**
     * CountingSort
     */
    void CountingSort(int array[])
    {
 
        int[] aux = new int[array.length];
 
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
          if (array[i] < min)
          {
            min = array[i];
          }
          else if(array[i] > max)
          {
            max = array[i];
          }
        }

        int[] counts = new int[max - min + 1];

        for (int i = 0;  i < array.length; i++)
        {
          counts[array[i] - min]++;
        }
 
        counts[0]--;
        for (int i = 1; i < counts.length; i++)
        {
          counts[i] = counts[i] + counts[i-1];
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            aux[counts[array[i] - min]--] = array[i];
        }
 
    }

    
    
    /**
     * SelectionSort
     */
    void SelectionSort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
}
