package org.CopsAndThieves;

import static org.CopsAndThieves.ThreadColor.ANSI_GREEN;

public class Thief extends Thread {

    private final int start;
    private final int end;

    private final int vaultCombinationNumber;

    public Thief(String name, int start, int end, int vaultCombinationNumber) {
        super(name);
        this.start = start;
        this.end = end;
        this.vaultCombinationNumber = vaultCombinationNumber;
    }

    @Override
    public void run() {


        for (int i = start; i <= end; i++) {

            int combination = Integer.parseInt(String.valueOf(i));

            try {
                Thief.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (combination == vaultCombinationNumber) {
                System.out.println(ANSI_GREEN + getName() + " broke in! The combination is " + combination + " ,thieves ran away with the loot.");
                System.exit(1);
            }

        }

    }

}


