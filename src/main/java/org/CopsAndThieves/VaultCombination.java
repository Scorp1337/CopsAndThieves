package org.CopsAndThieves;

import java.util.Random;

import static org.CopsAndThieves.ThreadColor.ANSI_CYAN;

public class VaultCombination implements Runnable {

    private int vaultCombinationNumber;

    public int getVaultCombinationNumber() {
        return vaultCombinationNumber;
    }

    @Override
    public void run() {
        Random random = new Random();
        vaultCombinationNumber = random.nextInt(10000) + 1;
        System.out.println(ANSI_CYAN +  "Vault combination " + vaultCombinationNumber);
    }
}
