public class NegativeException extends NumericsException{
    public NegativeException(){
        super("Numero Negativo!");
    }
    public NegativeException(String msg){
        super(msg);
    }

}
