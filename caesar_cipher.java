import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

class caesar_cipher {
    public static void main(String [] args){
        System.out.println("Welcome to the Caesar Cipher Application, Please Enter A Character!");
        //String [] letterInput = {"a","b","c","d"};

        Console inputConsole= System.console();
        String userMessage= inputConsole.readLine();

        //System.out.println("Encrypted is "+ letterInput[0]);
        System.out.println("You typed " + userMessage);

        System.out.println("Please Enter a Shift Value");
        Scanner scanVal = new Scanner(System.in);
        int shiftValue=  scanVal.nextInt();

        System.out.println("A Shift Value of " + shiftValue + " Has been Set");

        //if (userInput.equals(letterInput[0])){
        //    System.out.println("working affiliation equation");

        // }
        //typedCode(userInput);sssa
        int[]inputVals=stringToNumber(userMessage);
        int []encryptedVal=encryptor(inputVals, shiftValue);
        System.out.println(encryptedVal[0]);
    }
    /*****************************************************************
     Assigns a Value to each of the Characters typed by the user
     *****************************************************************/
    static int[] stringToNumber (String userMessage) {
        String inputLine = userMessage;
        /******************************************
         * Converts userMessage into individual characters
        *******************************************/
        char[] inputConverter = inputLine.toCharArray();
        System.out.println("input Line is "+ inputConverter.length + " Characters Long");
        /******************************************
         * Converts individual Characters into Numbers
         *****************************************/
        int [] inputVal;
        inputVal= new int[inputConverter.length];

        for (int i= 0; i < inputConverter.length; i++) {
            System.out.println(inputConverter[i]);
        }
        //System.out.println(array[1]);

        for (int a=0;a<inputConverter.length; a++){
            switch (inputConverter[a]){
                case 'a':
                    inputVal[a]=1;
                    break;
                case 'b':
                    inputVal[a]=2;
                    break;
                case 'c':
                    inputVal[a]=3;
                    break;
                case 'd':
                    inputVal[a]=4;
                    break;
                case 'e':
                    inputVal[a]=5;
                    break;
                case 'f':
                    inputVal[a]=6;
                    break;
                case 'g':
                    inputVal[a]=7;
                    break;
                case 'h':
                    inputVal[a]=8;
                    break;
                case 'i':
                    inputVal[a]=9;
                    break;
                case 'j':
                    inputVal[a]=10;
                    break;
                case 'k':
                    inputVal[a]=11;
                    break;
                case 'l':
                    inputVal[a]=12;
                    break;
                case 'm':
                    inputVal[a]=13;
                    break;
                case 'n':
                    inputVal[a]=14;
                    break;
                case 'o':
                    inputVal[a]=15;
                    break;
                case 'p':
                    inputVal[a]=16;
                    break;
                case 'q':
                    inputVal[a]=17;
                    break;
                case 'r':
                    inputVal[a]=18;
                    break;
                case 's':
                    inputVal[a]=19;
                    break;
                case 't':
                    inputVal[a]=20;
                    break;
                case 'u':
                    inputVal[a]=21;
                    break;
                case 'v':
                    inputVal[a]=22;
                    break;
                case 'w':
                    inputVal[a]=23;
                    break;
                case 'x':
                    inputVal[a]=24;
                    break;
                case 'y':
                    inputVal[a]=25;
                    break;
                case 'z':
                    inputVal[a]=26;
                    break;
            }
        }
        System.out.println(Arrays.toString(inputVal));


        return inputVal;
    }
    static int[] encryptor(int inputVals [], int shiftValue ){
        System.out.println(inputVals);
        //String convertedInputVal =inputVal.toString();// Turns inputVal into a Readable String
        //char[] inputConverter= convertedInputVal.toCharArray();// Breaks Down convertedInputVal into an array of individual Char
        System.out.println(inputVals.length);
        int inputValLength = inputVals.length;
        //int newVal;
        int [] encryptedVal={};

        for (int i=0; i< inputValLength; i++){
            System.out.println(inputVals[i]);
        };

        for (int i = 0; i < inputVals.length; i++){
          inputVals[i]= inputVals[i]+ shiftValue;
        }
        System.out.println("checking wait " + inputVals[0]);


        encryptedVal= inputVals;
        return encryptedVal;
    }



}