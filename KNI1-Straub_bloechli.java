/**
 * Titel
 * Beschreibung
 * Autoren
 * Datum
 * Version
 */


import java.util.Locale;
import ch.tbz.lib.Input;   // deine eigene Input-Klasse

class BMICalculator {
    public static void main(String[] args) {
    double gewicht;
    do {
        gewicht = Input.inputDouble("Please enter your weight in kg: ");
        if (gewicht <= 0.0) {
            System.out.println("Error: Weight must be greater than 0!");
        }
    } while (gewicht <= 0.0);

    double groesse;
    do {
        groesse = Input.inputDouble("Please enter your height in meters (e.g. 1.75): ");
        if (groesse <= 0.0) {
            System.out.println("Error: Height must be greater than 0!");
        }
    } while (groesse <= 0.0);

    if (groesse > 3.0) {
        groesse = groesse / 100.0;
    }

        double bmi = gewicht / (groesse * groesse);

        String bewertung;
        if (bmi < 18.5) {
            bewertung = "Underweight";
        } else if (bmi < 25.0) {
            bewertung = "Normal weight";
        } else if (bmi < 30.0) {
            bewertung = "Overweight";
        } else {
            bewertung = "Adipositas";
        }

        System.out.printf(Locale.GERMAN, "Your BMI is: %.2f (%s)\n", bmi, bewertung);
    }
}
