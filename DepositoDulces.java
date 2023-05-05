import java.util.ArrayList;

public class DepositoDulces {

    private ArrayList<Dulces> deposito;

    public DepositoDulces() {
        deposito = new ArrayList<Dulces>();
    }

    public void addDulces(Dulces Dulces) { // agrega Dulces al ArrayList<Dulces> deposito
        deposito.add(Dulces);
    }

    public Dulces getDulces() { // devuelve un dulce en caso de que hayan en el deposito, en caso contrario
        // retorna `null`
        if (deposito.isEmpty()) {
            return null;
        } else {
            Dulces Dulces = deposito.get(0);
            deposito.remove(0);
            return Dulces;
        }
    }
}