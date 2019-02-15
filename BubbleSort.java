
public class BubbleSort implements SortingAlgorithm{
    void sort(int []a){
        boolean swapped= True;
        for(int i=0; i< a.length-1; i++)
        {
            for(int j=0; i< a.length-1-i;j++){
                if(a[i]>a[i+1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        }
    }
}
