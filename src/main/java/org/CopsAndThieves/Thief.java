package org.CopsAndThieves;

import java.util.Random;

import static org.CopsAndThieves.ThreadColor.ANSI_CYAN;
import static org.CopsAndThieves.ThreadColor.ANSI_GREEN;

public class Thief extends Thread {

    private String name;
    private int start;
    private int end;

    private int vaultCombinationNumber;

    public Thief(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        this.vaultCombination();

        for (int i = start; i <= end; i++) {

            int combination = Integer.parseInt(String.valueOf(i));
//
            try {
                Thief.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (combination == vaultCombinationNumber) {
                System.out.println(ANSI_GREEN + "Combination is " + combination + " ,thieves ran away with the loot.");
                System.exit(1);
            }

        }

    }

    public void vaultCombination() {

        Random random = new Random();
        vaultCombinationNumber = random.nextInt(10000) + 1;
        System.out.println(ANSI_CYAN + "Vault combination " + vaultCombinationNumber);
    }

}
