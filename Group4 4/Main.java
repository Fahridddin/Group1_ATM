package com.fahriddin;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        intro();

        com.fahriddin.GFG.readFileNames();
        com.fahriddin.GFG.readFilePinCodes();
        com.fahriddin.GFG.readFileCardNums();
        com.fahriddin.GFG.readFileBalance();
        com.fahriddin.GFG.readFilPhoneNums();
        com.fahriddin.GFG.sentValue();

        com.fahriddin.Account.signIn();
    }

    public static void intro()
    {
        System.out.println("\nwelcome to the club buddy\n");
    }
}