package com.fahriddin;

import java.io.IOException;
import java.util.Objects;

public class Paper {
    public static void paper() throws IOException {
        System.out.println("\nAutomated teller machine");
        System.out.println("\nYour name : " + com.fahriddin.Account.client.get(0));
        System.out.println("Your Card Number: " + com.fahriddin.Account.client.get(1));
        System.out.println("Your Card Pin Code: " + com.fahriddin.Account.client.get(2));
        System.out.println("Your Balance: " + com.fahriddin.Account.client.get(3));
        System.out.println("Operation is done" + com.fahriddin.Account.client.get(4));
        System.out.println("\nWithdraw Cash: " + (Integer.parseInt(com.fahriddin.Account.client.get(3)) - Integer.parseInt(com.fahriddin.Account.client.get(5))));
        System.out.println("Reminder: " + com.fahriddin.Account.client.get(5));
        System.out.println("\n");

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(com.fahriddin.Account.client.get(4), Integer.toString(i)))
            {
                com.fahriddin.GFG.clCash.set(i, com.fahriddin.Account.client.get(5));
            }
        }
        com.fahriddin.Account.client.remove(3);
        com.fahriddin.Account.client.remove(3);
        com.fahriddin.GFG.writeFileBalance(com.fahriddin.GFG.clCash);
    }
}
