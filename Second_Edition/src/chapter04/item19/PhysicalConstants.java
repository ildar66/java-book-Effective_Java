// Constant utility class
package chapter04.item19;

public class PhysicalConstants {

    private PhysicalConstants() {
    } // Prevents instantiation

    // Avogadro's number (1/mol)
    public static final double AVOGADROS_NUMBER = 6.02214199e23;

    // Boltzmann constant (J/K)
    public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    // Mass of the electron (kg)
    public static final double ELECTRON_MASS = 9.10938188e-31;
}

/*
// Use of static import to avoid qualifying constants
import static com.effectivejava.science.PhysicalConstants.*;
public class Test {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
    ...
    // Many more uses of PhysicalConstants justify static import
}*/
