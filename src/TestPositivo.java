import java.util.Scanner;

public class TestPositivo {
    public static void main(String [] args) throws IntervalloException, NegativeException {
    Scanner t=new Scanner(System.in);
    int numero;
    NumeroPositivo n=new NumeroPositivo();

    System.out.println("dammi un numero positivo");
    numero=t.nextInt();
    try{
        n.setNumero(numero);
    }catch (NegativeException e) {
        System.out.println(e.getMessage());
    }catch (IntervalloException e){
        System.out.println(e.getMessage());
    }catch (NumericsException e){
        System.out.println(e.getMessage());
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}
