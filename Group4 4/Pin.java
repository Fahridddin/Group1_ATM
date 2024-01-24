package com.fahriddin;

import java.io.IOException;
import java.util.Objects;

import static com.fahriddin.Main.sc;

public class Pin {
    public static void changePin() throws IOException
    {
        System.out.println("\nInput New Pin Code\n");
        System.out.print("[****] -> ");
        String pin = sc.next();

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(com.fahriddin.Account.client.get(4), Integer.toString(i)))
            {
                com.fahriddin.GFG.clPins.set(i, pin);
            }
        }
        com.fahriddin.Account.client.remove(3);
        com.fahriddin.Account.client.remove(3);
        com.fahriddin.GFG.writeFilePin(com.fahriddin.GFG.clPins);
    }
}
