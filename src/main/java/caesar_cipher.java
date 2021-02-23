package src.main.java;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

 class input {

    String textInput;
    char[] textBlock;
     int[] numberOutput;

     public input (String textInput){
         this.textInput=textInput;
         this.textBlock=textInput.toCharArray();
     };

    int[] convertToNumber() {
        numberOutput= new int[textBlock.length];
        for (int i=0; i < textBlock.length;i++) {
            System.out.println(textBlock[i]);
            for (int a = 0; a < textBlock.length; a++) {
                switch (textBlock[a]) {
                    case 'a':
                        numberOutput[a] = 1;
                        break;
                    case 'b':
                        numberOutput[a] = 2;
                        break;
                    case 'c':
                        numberOutput[a] = 3;
                        break;
                    case 'd':
                        numberOutput[a] = 4;
                        break;
                    case 'e':
                        numberOutput[a] = 5;
                        break;
                    case 'f':
                        numberOutput[a] = 6;
                        break;
                    case 'g':
                        numberOutput[a] = 7;
                        break;
                    case 'h':
                        numberOutput[a] = 8;
                        break;
                    case 'i':
                        numberOutput[a] = 9;
                        break;
                    case 'j':
                        numberOutput[a] = 10;
                        break;
                    case 'k':
                        numberOutput[a] = 11;
                        break;
                    case 'l':
                        numberOutput[a] = 12;
                        break;
                    case 'm':
                        numberOutput[a] = 13;
                        break;
                    case 'n':
                        numberOutput[a] = 14;
                        break;
                    case 'o':
                        numberOutput[a] = 15;
                        break;
                    case 'p':
                        numberOutput[a] = 16;
                        break;
                    case 'q':
                        numberOutput[a] = 17;
                        break;
                    case 'r':
                        numberOutput[a] = 18;
                        break;
                    case 's':
                        numberOutput[a] = 19;
                        break;
                    case 't':
                        numberOutput[a] = 20;
                        break;
                    case 'u':
                        numberOutput[a] = 21;
                        break;
                    case 'v':
                        numberOutput[a] = 22;
                        break;
                    case 'w':
                        numberOutput[a] = 23;
                        break;
                    case 'x':
                        numberOutput[a] = 24;
                        break;
                    case 'y':
                        numberOutput[a] = 25;
                        break;
                    case 'z':
                        numberOutput[a] = 26;
                        break;
                }
                System.out.println(numberOutput);
            }
            ;
        }
        return numberOutput;
    }
}

class caesar_cipher {
    public static void main(String [] args){
        System.out.println("Welcome to the Caesar Cipher Application, Please Enter A Character!");
        //String [] letterInput = {"a","b","c","d"};

        //Console inputConsole= System.console();
        //String userMessage= inputConsole.readLine();
        Scanner userText = new Scanner(System.in);
        String userMessage = userText.nextLine();

        //System.out.println("Encrypted is "+ letterInput[0]);
        System.out.println("You typed " + userMessage);

        System.out.println("Please Enter a Shift Value");
        Scanner scanVal = new Scanner(System.in);
        int shiftValue=  scanVal.nextInt();
        int messageLength= userMessage.length();

        System.out.println("A Shift Value of " + shiftValue + " Has been Set");

        //if (userInput.equals(letterInput[0])){
        //    System.out.println("working affiliation equation");

        // }
        //typedCode(userInput);




        input newMessage= new input(userMessage);
        newMessage.textInput=userMessage;

        int[]enumerated=newMessage.convertToNumber();

        System.out.println("class Def returned " + enumerated.length);
        System.out.println("class Def returned Code: " + Arrays.toString(enumerated));







        int[]inputVals=stringToNumber(userMessage);
        int []encryptedVal=encryptor(inputVals, shiftValue);
        
        System.out.println("Would You like to Decrypt a message?");

        int []decryptedVal=decryptor(encryptedVal, shiftValue);
        String [] outputVal= numberToString(decryptedVal);
        //System.out.println(encryptedVal[0]);
        //System.out.println(decryptedVal[0]);

        String outputValDecoded= Arrays.toString(outputVal);

        String str = String.join("", outputVal);
        System.out.println("the value is " + str);
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
        System.out.println(Arrays.toString(encryptedVal));
        return encryptedVal;
    }
    static int[] decryptor(int encryptedVal [], int shiftValue ){
        System.out.println(shiftValue);

        System.out.println(encryptedVal.length);
        int encryptedValLength = encryptedVal.length;
        int [] decryptorVal={};

        for (int i=0; i< encryptedValLength; i++){
            System.out.println(encryptedVal[i]);
        };

        for (int i = 0; i < encryptedVal.length; i++){
            encryptedVal[i]= encryptedVal[i]- shiftValue;
        }
        System.out.println("checking wait " + encryptedVal[0]);


        decryptorVal= encryptedVal;
        System.out.println(Arrays.toString(encryptedVal));
        return decryptorVal;
    }
    static String [] numberToString (int decryptedVal[]) {

        int[] outputConverter = decryptedVal;
        System.out.println("input Line is "+ outputConverter.length + " Characters Long");

        String [] outputVal;
        outputVal= new String [outputConverter.length];

        for (int i= 0; i < outputConverter.length; i++) {
            System.out.println(outputConverter[i]);
        }
        //System.out.println(array[1]);

        for (int a=0;a<outputConverter.length; a++){
            switch (outputConverter[a]){
                case 1:
                    outputVal[a]="a";
                    break;
                case 2:
                    outputVal[a]="b";
                    break;
                case 3:
                    outputVal[a]="c";
                    break;
                case 4:
                    outputVal[a]="d";
                    break;
                case 5:
                    outputVal[a]="e";
                    break;
                case 6:
                    outputVal[a]="f";
                    break;
                case 7:
                    outputVal[a]="g";
                    break;
                case 8:
                    outputVal[a]="h";
                    break;
                case 9:
                    outputVal[a]="i";
                    break;
                case 10:
                    outputVal[a]="j";
                    break;
                case 11:
                    outputVal[a]="k";
                    break;
                case 12:
                    outputVal[a]="l";
                    break;
                case 13:
                    outputVal[a]="m";
                    break;
                case 14:
                    outputVal[a]="n";
                    break;
                case 15:
                    outputVal[a]="o";
                    break;
                case 16:
                    outputVal[a]="p";
                    break;
                case 17:
                    outputVal[a]="q";
                    break;
                case 18:
                    outputVal[a]="r";
                    break;
                case 19:
                    outputVal[a]="s";
                    break;
                case 20:
                    outputVal[a]="t";
                    break;
                case 21:
                    outputVal[a]="u";
                    break;
                case 22:
                    outputVal[a]="v";
                    break;
                case 23:
                    outputVal[a]="w";
                    break;
                case 24:
                    outputVal[a]="x";
                    break;
                case 25:
                    outputVal[a]="y";
                    break;
                case 26:
                    outputVal[a]="z";
                    break;
            }
        }
        System.out.println(Arrays.toString(outputVal));


        return outputVal;
    }
}



class encoder{

}

class decoder{}

class output{}

