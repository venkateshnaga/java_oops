public class BubbleSort
{  
    static void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int k=1; k < (n-i); k++)
                 {  
                          if(arr[k-1] > arr[k])
                          {  
                                 temp = arr[k-1];  
                                 arr[k-1] = arr[k];  
                                 arr[k] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) 
    {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Sorting");  
                for(int i=0; i < arr.length; i++)
                {  
                       System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);  
                 
                System.out.println("Array After Sorting");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
