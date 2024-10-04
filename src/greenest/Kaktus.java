package greenest;

// Klass för kaktusar som implementerar IVäxt
public class Kaktus implements IVäxt {
    private String namn; // Växtens namn (inkapsling)
    private double längdIMeter; // Växtens längd i meter (inkapsling)

    // Konstruktor som skickar växtens namn och längd
    public Kaktus(String namn, double längdIMeter) {
        this.namn = namn; // Sätter växtens namn
        this.längdIMeter = längdIMeter; // Sätter längd
    }

    // Implementering av BeräknaVattenmängd från IVäxt (Polymorfism)
    @Override
    public double BeräknaVattenmängd() {
        return 0.02; // Varje kaktus får 2 cl (0.02 liter) mineralvatten
    }

    // Implementering av HämtaVätskeTyp från IVäxt
    @Override
    public VätskeTyp HämtaVätskeTyp() {
        return VätskeTyp.MINERALVATTEN; // Kaktusar får mineralvatten
    }

    // Getter för växtens namn
    @Override
    public String getNamn() {
        return namn; // Returnerar växtens namn
    }
}

