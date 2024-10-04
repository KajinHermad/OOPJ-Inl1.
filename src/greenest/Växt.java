package greenest;

// Abstrakt klass som implementerar IVäxt
public abstract class Växt implements IVäxt {
    private String namn; // Växtens namn (inkapsling)
    private double längdIMeter; // Växtens längd i meter (inkapsling)

    // Konstruktor för att initiera namn och längd
    public Växt(String namn, double längdIMeter) {
        this.namn = namn; // Sätter växtens namn
        this.längdIMeter = längdIMeter; // Sätter längd
    }

    // Getter för att hämta längden i meter
    public double getLängdIMeter() {
        return längdIMeter; // Returnerar längden
    }

    // Getter för att hämta växtens namn
    @Override
    public String getNamn() {
        return namn; // Returnerar växtens namn
    }
}


