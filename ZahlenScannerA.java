import java.util.Scanner;

public class ZahlenScannerA {

	public static void main(String[] args) {
		//include scanner for reading input
		Scanner scan = new Scanner(System.in);
		
		int input;  //declare variable
		
		System.out.println("Geben Sie eine Zahl zwischen 2 und 6 ein:");
		
		input = scan.nextInt();
		
		if ((input >= 2) && (input <= 6)) {
			int zaehler = 0;
			for (int i = -5; i < 5; i++) {
				zaehler = zaehler + i + input;
				System.out.println(zaehler);
			}
			
		} else {
			System.err.println("Achtung, falsche Eingabe!");
		}
		System.out.println("und fertig!");

		scan.close();
	}
}


/*  1) Welche Zahl erscheint 2x auf der Konsole?

		"-1"

	2) Sie setzen den Breakpoint bei der FOR-Schleife.
	Lassen Sie das Programm an diesem Breakpoint halten. Welcher Code-Teil 
	würde nun als nächstes ausgeführt werden?

		"Zeile 18 (i = -5)"

	3) Welche Tastenkombination ermöglicht das Abbrechen des Debuggers während der Ausführung?

		"Shift+F5"

	4) Wie gross ist der Inhalt der Variable zaehler, wenn die Variable i auf Null wechselt?

		"5"



*/