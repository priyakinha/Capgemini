package Feb25.FirstHalf;

public class Fact {
    public static void main(String[] args) {
        Ifact f= FindFact::origFact;
        System.out.println(f.factOfInterface(6));
    }
}
