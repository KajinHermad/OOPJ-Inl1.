package greenest;

// Interface som definierar metoder för att beräkna vattenmängd och hämta vätsketyp
public interface IVäxt {
    double BeräknaVattenmängd(); // Abstrakt metod för vattenberäkning
    VätskeTyp HämtaVätskeTyp();  // Abstrakt metod för att hämta vätsketyp
    String getNamn();             // Metod för att hämta växtens namn
}
