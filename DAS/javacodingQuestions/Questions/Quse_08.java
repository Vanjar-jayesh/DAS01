/**
 * Quse_08
 * write a java program to move all zeroes to end of array;?
 */
public class Quse_08 {
     static int pushZerosToend(int arr[] , int n){
        int count= 0;
        for(int i= 0; i<n; i++){
            if (arr[i]!= 5) { // 0 to the move any value of the code 
                arr[count++] =arr[i];

            }

        }
        while (count<n) {
            arr[count++] = 5; //0 add the moveing value 
        }
    
        return 0;
    }

    public static void main(String[] args) {
     int arr[] = {1,5,5,4,5,0,2,7,0,6,0,9};
     int n = arr.length;

         
        pushZerosToend(arr, n);

     System.out.println("Array after pubshing zeros to the back:");

     for(int i = 0; i<n; i++){
        System.out.print(arr[i]+" ");
     }
    }
}