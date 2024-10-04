package greenest;

import java.util.Scanner;

public class Huvudprogram {
    public static void main(String[] args) {
        // Skapar växtobjekt av olika typer
        IVäxt[] växter = {
                new Kaktus("Igge", 0.2), // 20 cm
                new Palm("Laura", 5),    // 5 meter
                new KöttätandeVäxt("Meatloaf", 0.7), // 0.7 meter
                new Palm("Olof", 1)      // 1 meter
        };

        Scanner scanner = new Scanner(System.in);

        // Frågar användaren om växtens namn
        System.out.print("Vilken växt ska få vätska? ");
        String inputNamn = scanner.nextLine();

        // Letar efter växten
        boolean found = false;
        for (IVäxt växt : växter) {
            if (växt.getNamn().equalsIgnoreCase(inputNamn)) {
                // Beräkna och visa resultat
                System.out.printf("Växten %s ska ha %.2f liter %s.%n",
                        växt.getNamn(),
                        växt.BeräknaVattenmängd(),
                        växt.HämtaVätskeTyp());
                found = true; // Växten hittades
                break;
            }
        }

        // Felmeddelande om växten inte hittades
        if (!found) {
            System.out.println("Fel: Växten '" + inputNamn + "' hittades inte.");
        }

        scanner.close(); // Stänger scanner
    }
}

