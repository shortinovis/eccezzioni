public class IntervalloException extends IllegalArgumentException{
    public IntervalloException(){
        super("Numero fuori dal range!");
    }
    public IntervalloException(String msg){
        super(msg);
    }
}
