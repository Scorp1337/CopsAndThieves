package org.CopsAndThieves;

import java.util.Random;

import static org.CopsAndThieves.ThreadColor.ANSI_CYAN;

/**
 * Create an APP that has 4 thieves and 1 Cop, where the thieves are trying to break into a vault and the cops are
 * trying to catch them. Vault combination is set to be random from 1 to 10000.
 */
public class App {
    public static void main(String[] args) {
        int vaultCombinationNumber;
        Random random = new Random();
        vaultCombinationNumber = random.nextInt(40000) + 1;
        System.out.println(ANSI_CYAN + "Vault combination " + vaultCombinationNumber);

        Thief thief1 = new Thief("Thief 1", 1, 10000, vaultCombinationNumber);
        Thief thief2 = new Thief("Thief 2", 10001, 20000, vaultCombinationNumber);
        Thief thief3 = new Thief("Thief 3", 20001, 30000, vaultCombinationNumber);
        Thief thief4 = new Thief("Thief 4", 30001, 40000, vaultCombinationNumber);

        thief1.start();
        thief2.start();
        thief3.start();
        thief4.start();

        Cop cop = new Cop("Cop");
        cop.start();


    }
}

