package org.CopsAndThieves;

import static org.CopsAndThieves.ThreadColor.ANSI_BLUE;
import static org.CopsAndThieves.ThreadColor.ANSI_RED;

public class Cop extends Thread{

    private String name;
    private  int time = 10;

    public Cop(String name,int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        this.countdown();

        for (int i = time; i >= 0;i--){

        }try{
            Cop.sleep(1);
        } catch (InterruptedException e) {

        }
        System.out.println(ANSI_BLUE +  "BUSTED");
    }

    public void countdown(){
        int countdown = 10;
        while (countdown>0){
            System.out.println( ANSI_RED + countdown);
            try {
                countdown--;
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {

            }
        }
    }
}
