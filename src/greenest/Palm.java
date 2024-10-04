package greenest;

// Klass för palmer som implementerar IVäxt
public class Palm implements IVäxt {
    private String namn; // Växtens namn (inkapsling)
    private double längdIMeter; // Växtens längd i meter (inkapsling)

    // Konstruktor som skickar växtens namn och längd till basklassen
    public Palm(String namn, double längdIMeter) {
        this.namn = namn; // Sätter växtens namn
        this.längdIMeter = längdIMeter; // Sätter längd
    }

    // Implementering av BeräknaVattenmängd från IVäxt (Polymorfism)
    @Override
    public double BeräknaVattenmängd() {
        return 0.5 * längdIMeter; // 0,5 liter kranvatten per meter
    }

    // Implementering av HämtaVätskeTyp från IVäxt
    @Override
    public VätskeTyp HämtaVätskeTyp() {
        return VätskeTyp.KRANVATTEN; // Palmer får kranvatten
    }

    // Getter för växtens namn
    @Override
    public String getNamn() {
        return namn; // Returnerar växtens namn
    }
}
