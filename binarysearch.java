

// public class binarysearch {
//   public static int binarySearch(int arr[], int key){
//     int left = 0 , right = arr.length-1;

//     for(int i=0; i<arr.length; i++){
//         while(left <= right) {
//             int mid = (left + right) / 2;
//             if(arr[mid] == key){
//                 return mid;
//             }else if(arr[mid] < key){
//                 left = mid + 1;
//             }else{
//                 right = mid -1;
//             }
            
//         }
//     }
//     return -1;
// }

  



//     public static void main(String[] args){
//         int arr[] = {2,4,6,8,10,11,12,13,14,15,16,17};
//         int key = 15;

//         int result = binarySearch(arr,key);

//         if(result != -1){
//             System.out.println("Element found at position: "+ result);

//         }else{
//             System.out.println("Element Not Found");
//         }
//     }



// }
public class binarysearch{
    public static int binarysearch(int arr[],int key){
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<=arr.length;i++){
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]<key){
                  left=  mid+1;
                }
                else{
                   right= mid-1;
                }
            }
           
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,7,9,19};
        int key=9;
int result=binarysearch(arr,key);
if(result==-1){
    System.out.println("element not found at any dorema");
}
else{
    System.out.println("element found at index of this :"+result);
}
    }
}
