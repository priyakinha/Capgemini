package Feb25.FirstHalf;

public class demonstartionMain {
    public static void main(String[] args) {

        Idemonstration d=new demonstration("ffffff")::getName;
        System.out.println(d.createName("Priya"));
    }
}
