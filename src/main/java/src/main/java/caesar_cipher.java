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
        //System.out.println("class Def returned " + enumerated.length);
        //System.out.println("class Def returned Code: " + Arrays.toString(enumerated));


        encoder encryptedMessage = new encoder(enumerated, shiftValue);// Creates an Encoder Object
        encryptedMessage.inputVals= enumerated;
        encryptedMessage.shiftValue= shiftValue;
        int[] encrypted = encryptedMessage.convertToEncode();
        System.out.println("New Code is "+ Arrays.toString(encrypted));



        System.out.println("Would You like to Decrypt a message?");
        Scanner userIn = new Scanner (System.in);
        String userAuth = userIn.next();
        if (userAuth == "y"){
            System.out.println("Kindly Enter An encoded message");
            //int[]encrypted1 ={1,2,3,4,5};
        }


        decoder decryptedVal= new decoder(encrypted,shiftValue); // Creates a Decoder Object
        decryptedVal.encryptedVal=encrypted;
        decryptedVal.shiftValue=shiftValue;
        int[] decrypted =decryptedVal.convertToDecode();


        numberToString outPutVal1= new numberToString(decrypted);
        System.out.println("Decrypted " + outPutVal1.getoutputVal());

        //String str = String.join("", outputValDecoded);
        //System.out.println("the value is " + str);
    }

}


