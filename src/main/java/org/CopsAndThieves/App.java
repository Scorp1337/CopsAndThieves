package org.CopsAndThieves;

/**
 * Am reusit sa fac clasa Cop sa faca tot ce trebuie. Face countdownul de la 10 la 0.
 * Am facut si clasa VaultCombination care creeaza un numar random intre 1 si 10000, desi cred ca aceasta combinatie ar
 * fi buna poate in thieves deoarece ei incearca sa o descifreze.

 * Clasa Thief are nume, un start si un end deoarece ne trebuie  4 thieves cu 4 rangeuri diferite, dar nu stiu cum sa
 * fac sa iau acel numar dat de thief1,2,3 sau 4 sa il introduc intr-un if (nrThief == vaultCombination) si sa printeze
 * ca au gasit combinatia sau sa iasa din program.
 *
 * Clasa ThreadColor e doar ceva fun care am vazut intr-un alt cod si am zis ca ar fi fun printurile sa fie in culori
 * diferite.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {


        VaultCombination vaultCombination = new VaultCombination();
        Thread vault = new Thread(vaultCombination);

        vault.start();
        vault.join();

        Cop cop = new Cop("Cop", 10);
        cop.start();


        Thief thief1 = new Thief("Thief 1", 1, 2500);
        Thief thief2 = new Thief("Thief 2", 2501, 5000);
        Thief thief3 = new Thief("Thief 3", 5001, 7500);
        Thief thief4 = new Thief("Thief 4", 7501, 10000);

        thief1.start();
        thief2.start();
        thief3.start();
        thief4.start();








    }
}
