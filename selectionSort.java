public class selectionSort {


    //Create a method to print the array
        public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }




    //Create a main method to test the implementation of selection sort

    public static void main(String[] args){
            int[] arr = new int[]{6, 4, 5, 3, 2, 0, 1};
            System.out.print("Original Array: \n");
            printArray(arr);
            selectionSort(arr);
            System.out.print("Sorted Array: \n");
            printArray(arr);


    }


    //contains the implementation of selection sort
    public static void selectionSort(int[] arr){

        //instantiate the least index
        int minimumInd;

        //find the least index present in the array
        for(int i = 0; i<arr.length - 1; i++){

            minimumInd = i;
           for(int j = i+1; j<arr.length; j++){
               if(arr[j]<arr[minimumInd]){
                   minimumInd = j;
               }
           }

            //swap the current with the minimum index if the current is strictly greater than the minimum index
            int temp = arr[minimumInd];
            arr[minimumInd] = arr[i];
            arr[i] = temp;

        }


    }
}
