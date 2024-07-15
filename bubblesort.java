public class bubblesort {
    public static int bubblesort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){  //arr.length matlab agar array me 5 elements hai to i 4 reheta  
            
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  
  }
 
            }
           
         
                }
               return -1;
    }
public static void main(String[] args){
    int arr[]={8,4,6,5};
    bubblesort(arr);
    System.out.println("sorted array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }

}
}