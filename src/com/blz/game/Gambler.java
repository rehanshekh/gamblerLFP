package com.blz.game;

public class Gambler {
    public static final int BET = 1;
    public static final int AMOUNT = 100;

    public static void main(String[] args) {
        double startamount = 100;
        int day;
        for (day = 1; day <= 20; day++) {
            int stake = 100;
            while (stake > (0.5 * AMOUNT) && stake < (1.5 * AMOUNT)) {
                int chance = (int) (Math.floor(Math.random() * 10) % 2);
                if (chance == BET) {
                    stake++;
                } else if (chance == 0) {
                    stake--;
                }

            }
            {
                if (stake > AMOUNT) {
                    startamount = startamount + (0.5 * AMOUNT);
                } else if (stake < AMOUNT) {
                    startamount = startamount - (0.5 * AMOUNT);
                }

            }
        }
        if (startamount > AMOUNT) {
            System.out.println("Won, After 20 days, the total amount is:" + startamount);
        } else if (startamount < AMOUNT) {
            System.out.println("Lost, After 20 days, the total amount is:" + startamount);
        } else System.out.println("Neither Won nor Lose, After 20 days, the total amount is:" + startamount);
    }
}
