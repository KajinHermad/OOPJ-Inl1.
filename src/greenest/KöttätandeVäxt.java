package greenest;

// Klass för köttätande växter som implementerar IVäxt
public class KöttätandeVäxt implements IVäxt {
    private String namn; // Växtens namn (inkapsling)
    private double längdIMeter; // Växtens längd i meter (inkapsling)

    // Konstruktor som skickar växtens namn och längd
    public KöttätandeVäxt(String namn, double längdIMeter) {
        this.namn = namn; // Sätter växtens namn
        this.längdIMeter = längdIMeter; // Sätter längd
    }

    // Implementering av BeräknaVattenmängd från IVäxt (Polymorfism)
    @Override
    public double BeräknaVattenmängd() {
        return 0.1 + (0.2 * längdIMeter); // Basnivå + extra beroende på längd
    }

    // Implementering av HämtaVätskeTyp från IVäxt
    @Override
    public VätskeTyp HämtaVätskeTyp() {
        return VätskeTyp.PROTEINDRYCK; // Köttätande växter får proteindryck
    }

    // Getter för växtens namn
    @Override
    public String getNamn() {
        return namn; // Returnerar växtens namn
    }
}

