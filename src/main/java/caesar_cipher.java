package src.main.java;

import java.util.Arrays;
import java.util.Scanner;

class caesar_cipher {
    public static void main(String [] args){

        /*************************************************
            Tells user to type in a message For Encryption
         *************************************************/
        System.out.println("Welcome to the Caesar Cipher Application, Please Enter A Message to Encrypt!");

        Scanner userText = new Scanner(System.in);
        String userMessage = userText.nextLine(); // Waits for user input and scans it into userMessage
        System.out.println("You typed " + userMessage); // Prints userMessage



        System.out.println("Please Enter a Shift Value");
        Scanner scanVal = new Scanner(System.in);
        int shiftValue=  scanVal.nextInt();// Assigns a shift Value
        int messageLength= userMessage.length();
        System.out.println("A Shift Value of " + shiftValue + " Has been Set");

        /************************************************************************************
         *Assigns values to the relevant classes for conversion
         ************************************************************************************/

        stringToNumber newMessage= new stringToNumber(userMessage);// Creates a new stringToNumber Object
        newMessage.textInput=userMessage;
        int[]enumerated=newMessage.convertToNumber(); // Takes in Enumerated message
        System.out.println("class Def returned " + enumerated.length);
        System.out.println("class Def returned Code: " + Arrays.toString(enumerated));


        encoder encryptedMessage = new encoder(enumerated, shiftValue);// Creates an Encoder Object
        encryptedMessage.inputVals= enumerated;
        encryptedMessage.shiftValue= shiftValue;
        int[] encrypted = encryptedMessage.convertToEncode();
        System.out.println("New Code is "+ Arrays.toString(encrypted));
        
        System.out.println("Would You like to Decrypt a message?");

        decoder decryptedVal= new decoder(encrypted,shiftValue); // Creates a Decoder Object
        decryptedVal.encryptedVal=encrypted;
        decryptedVal.shiftValue=shiftValue;
        int[] decrypted =decryptedVal.convertToDecode();
        String [] outputVal= numberToString(decrypted);
        String outputValDecoded= Arrays.toString(outputVal);

        String str = String.join("", outputVal);
        System.out.println("the value is " + str);
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

class numberToString{}

