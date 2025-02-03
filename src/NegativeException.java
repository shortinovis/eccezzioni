public class NegativeException extends IllegalArgumentException{
    public NegativeException(){
        super("Numero Negativo!");
    }
    public NegativeException(String msg){
        super(msg);
    }

}
