public class IntervalloException extends NumericsException{
    public IntervalloException(){
        super("Numero fuori dal range!");
    }
    public IntervalloException(String msg){
        super(msg);
    }
}
