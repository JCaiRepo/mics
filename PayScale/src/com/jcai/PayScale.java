package com.jcai;
import java.lang.Math;

public class PayScale {

    final int max_hrs = 60;

    public static void main(String[] args) {
	//Overtime: More than 40 hours, paid 1.5 times base pay
	// Minimum Wage: $8.00/hour
	// Maximum Work: 60 hours a week
	// command line argument is working hrs

        int working_hrs;
        double pay_rate = 8.0;
        double overtime_rate = 8.0*1.5;
        double payscale;

        working_hrs = Integer.parseInt(args[0]);
        if (working_hrs <= 40) {
            payscale = pay_rate * working_hrs;
        } else if (working_hrs <=60) {
            payscale = pay_rate * 40 + overtime_rate * (working_hrs - 40);
        } else{
            System.out.println("The maximum allowed working hours per week is 60.");
            return;
        }

        System.out.println("Pay scale for this week is " + payscale);

    }
}
