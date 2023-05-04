package org.CopsAndThieves;

import static org.CopsAndThieves.ThreadColor.ANSI_BLUE;
import static org.CopsAndThieves.ThreadColor.ANSI_RED;

public class Cop extends Thread {

    private String name;


    public Cop(String name) {
        super(name);
    }

    @Override
    public void run() {
        this.countdown();
        try {
            Cop.sleep(1);
        } catch (InterruptedException e) {

        }
        System.out.println(ANSI_BLUE + "BUSTED");
        System.exit(1);
    }

    public void countdown() {
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(ANSI_RED + countdown);
            try {
                countdown--;
                Thread.sleep(1000L);
            } catch (InterruptedException e) {

            }
        }
    }
}
