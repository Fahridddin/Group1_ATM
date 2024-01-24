package com.fahriddin;

import java.io.IOException;
import java.util.Objects;

import static com.fahriddin.Main.sc;

public class SMS {
    public static void connectSms() throws IOException {
        System.out.print("\nInput Phone Number: ");
        String phoneNum = sc.next();

        for(int i = 0; i < 10; i++)
        {
            if(Objects.equals(com.fahriddin.Account.client.get(4), Integer.toString(i)))
            {
                com.fahriddin.GFG.clPhone.set(i, phoneNum);
            }
        }
        com.fahriddin.GFG.writeFilePhone(com.fahriddin.GFG.clPhone);
    }
}
