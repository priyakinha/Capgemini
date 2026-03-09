package Feb25.FirstHalf;

public class FindFact {
    public static int origFact(int n){
        if(n<=1) return 1;
        return n*origFact(n-1);
    }

}
