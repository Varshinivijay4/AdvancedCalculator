package calculator;

import operations.Trig;
import operations.Matrix;
import operations.Eqt;

public class Calc {

    public static void main(String[] args) {

        System.out.println("ADVANCED CALCULATOR");

        System.out.println("Sin 30: " + Trig.sin(30));
        System.out.println("Cos 60: " + Trig.cos(60));
        System.out.println("Tan 45: " + Trig.tan(45));

        Matrix.add(1, 2, 3, 4);

        Eqt.solve(1, -5, 6);
    }
}