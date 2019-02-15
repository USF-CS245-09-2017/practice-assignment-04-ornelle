public class SelectionSort implements SortingAlgorithm {

    void sort(int []a) {
        for(int i=0; i<a.length-1; i++)
        {
            int min= i;
            for(int j=i+1; j<a.length; i++)
            {
                if(a[j]<a[min])
                    min=j;
            }
            int temp= arr[mid];
            arr[mid]= arr[i];
            arr[i]=temp;
        }
    }
}
