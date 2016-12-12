package chapter_4.item_17;

/*
// Constant interface pattern - do not use!
public interface PhysicalConstants {

    // Avogadro's number (1/mol)
    static final double AVOGADROS_NUMBER = 6.02214199e23;
    // Boltzmann constant (J/K)
    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
    // Mass of the electron (kg)
    static final double ELECTRON_MASS = 9.10938188e-31;
}
*/

// Constant utility class
public class PhysicalConstants {

    private PhysicalConstants() {
    } // Prevents instantiation

    public static final double AVOGADROS_NUMBER = 6.02214199e23;
    public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
    public static final double ELECTRON_MASS = 9.10938188e-31;
}
