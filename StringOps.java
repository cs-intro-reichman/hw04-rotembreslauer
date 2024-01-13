import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(Arrays.toString(allIndexOf("MMMM",'M')));
        
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        
        for (int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
             switch(currentChar){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                newString = newString + (char)(currentChar - 32);
                break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                newString = newString + (char)(currentChar + 32);
                break;
            default:
                if (currentChar >= 'B' && currentChar <= 'Z'){
                    newString = newString + (char)(currentChar + 32);
                } else {
                    newString = newString + currentChar;
                }
             }
        }
        return newString;
    }
    public static String camelCase (String string) {
           String newString = "";
           String firstWord = "";
           boolean word = false;
           boolean firstL = true;
           int endFirstWord = 0;


           for(int i = 0; i < string.length(); i++){ // chek if there is spase
            char currentChar = string.charAt(i);
            if(currentChar != 32 && !word){
                firstWord = firstWord + currentChar; // set first word
            } else if ((currentChar == 32) && (firstWord != "")){
                word = true;
                endFirstWord = i + 1;
                break;
            }
            }
            for(int i = 0; i < firstWord.length(); i ++){ //change first word to lowercase
                char currentChar = firstWord.charAt(i);
                if (currentChar >= 'A' && currentChar <= 'Z'){
                    newString = newString + (char)(currentChar + 32); 
               } else {
                    newString = newString + currentChar;
               }
            }
            while(endFirstWord < string.length()){

                while((endFirstWord < string.length()) && (string.charAt(endFirstWord) != 32)){   // fix each word
                    char currentChar = string.charAt(endFirstWord);
                    if(firstL){ // first letter 
                        if(currentChar >= 'a' && currentChar <= 'z'){  
                            newString = newString + (char)(currentChar - 32);
                        }else {
                            newString = newString + currentChar;
                        }
                        firstL = false;
                    } else { // other letters
                       if(currentChar >= 'A' && currentChar <= 'Z'){ 
                            newString = newString + (char)(currentChar + 32);
                        } else {
                            newString = newString + currentChar;   
                    }
            }
            endFirstWord = endFirstWord +1;
             }
             endFirstWord = endFirstWord +1;
             firstL = true;
            }
            return newString;
        }

    public static int[] allIndexOf (String string, char chr) {

        int len = 0;
     for(int i = 0; i < string.length(); i++){
        len ++;
     }
     int array[] = new int[len]; // new array
     int count = 0;

     for(int i = 0; i < string.length(); i++){
        if(string.charAt(i) == chr){
            array[i] = 1; 
            count ++;
        }
     }
    
     int array1[] = new int[count];
     int j = 0;

     for(int i = 0; i < array1.length; i ++){
       while(j < array.length){
        if(array[j] == 1){
            array1[i] = j;
            break;
            }
            j ++;
        }
        j++;
    }
        return  array1;
    }
}
