package lab6;

public class МузичнаКомпозиція {
    private String назва;
    private int тривалість;

    public МузичнаКомпозиція(String назва, int тривалість) {
        this.назва = назва;
        this.тривалість = тривалість;
    }

    public int віддайТривалість() {
        return тривалість;
    }

    @Override
    public String toString() {
        return назва + " " + this.getClass().getSimpleName() + " "+ тривалість + " с.";
    }
}
