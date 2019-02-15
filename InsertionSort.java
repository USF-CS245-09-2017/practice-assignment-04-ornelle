
public class InsertionSort implements SortingAlgorithm
{
    int temp;
    void sort(int [] a){
        for(int i=1; i< a.length; i++)
        {
            temp= a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                --j;
            }
            a[j+1]=temp;
        }
    }
}
