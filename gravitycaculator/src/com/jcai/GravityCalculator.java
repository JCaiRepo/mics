package com.jcai;
import java.lang.Math;

public class GravityCalculator {

    public static void main(String[] args)  {
	// gravity calculator which require 3 input parameters and output falling object location
	// x(t) = 0.5*a*t^2 + v_i*t + x_i
    // where a is gravity,
    // t is any given time,
    // v_i is initial speed of the object,
    // x_i is the initial position of the object
        double a, t, v_i, x_i;
        double x_t;
        try {
            a = Double.parseDouble(args[0]);
            t = Double.parseDouble(args[1]);
            v_i = Double.parseDouble(args[2]);
            x_i = Double.parseDouble(args[3]);
            x_t = 0.5 * a * java.lang.Math.pow(t, 2) + v_i * t + x_i;
            System.out.println("The position of the falling item is " + x_t);
        } catch (NumberFormatException e) {
            //command line formatting message
            System.err.println("Please use the this format: $java Main <a> <t> <v_i> <x_i>");
        }
        System.out.println("Calculation attempt completed");
    }
}
