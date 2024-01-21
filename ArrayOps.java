public class ArrayOps {
    public static void main(String[] args) {

        int[] array = {1,2,3,5,5};

       System.out.println(secondMaxValue(array));
       
     }
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sum = 0;
        int fullSum = 0;

        // #feedback - you can have one for loop and update sum and fullSum together.
        for (int i = 0; i < n; i ++){ //give the full sum
            sum = sum + array[i]; 
        }
        for(int i = 0; i < n + 1; i++){ //array sum
            fullSum = fullSum + i;
        }
        // #feedback - you can return fullSum - sum, no need to declare missingValue variable.
         int missingValue = fullSum - sum;

           return missingValue;
         }
      
    

    public static int secondMaxValue(int [] array) {
        
        int n = array.length;
        int max1 = 0; 
        int max2 = 0; 
        int count = 0;

        for(int i = 0; i < n; i ++){
            if (array[i] > max1){
                max1 = array[i]; // max of the array
            }
        }
        for(int i = 0; i < n; i++){
            if(array[i] == max1){
                count ++;
            }
         }
         if (count > 1){
            max2 = max1;
         }
         else{
            for(int i = 0; i < n; i ++){

                if(((array[i] > max2) && (array[i] < max1))){
                    max2 = array[i]; // second max of array
                }
                }
         }
        
            return max2;

        } 
       

    public static boolean inArray(int [] array, int num) {

        // #feedback - please note the correct indentation throughout the file.
        for(int i = 0; i < array.length; i++){

            if((array[i] == num)){

                return true;
            }
        }
        return false;
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {

            for (int i = 0; i < array2.length; i ++){ 
                if(!(inArray(array1, array2[i]))){   
                    return false;
                }  
          }
          for (int i = 0; i < array1.length; i ++){ 
            if(!(inArray(array2, array1[i]))){   
                return false;
            }
        }
       return true;
        }

    public static boolean isSorted(int [] array) {

        int n = array.length;
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < n; i ++){
            if(array[i] > array[i-1]){ //chek if increasing
                increasing = true;
            }
            if(array[i] < array[i-1]){ //chek if decreasing
                decreasing = true;
            }
        }
           if (decreasing && increasing){
                return false;
            }
        return true;
    }
}
         


