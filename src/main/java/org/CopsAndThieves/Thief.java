package org.CopsAndThieves;

import org.w3c.dom.ranges.Range;

import java.util.Random;

import static org.CopsAndThieves.ThreadColor.ANSI_CYAN;

public class Thief extends Thread{

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

        for (int i = start; i <= end; i++) {
//            System.out.println(ANSI_GREEN + getName() + " Vault combination is " + String.valueOf(i));
            try {

                Thief.sleep(1);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }




}
