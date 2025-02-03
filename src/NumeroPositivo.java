public class NumeroPositivo {
        private int numero;

    public NumeroPositivo() throws NegativeException{

    }
        public NumeroPositivo(int numero) throws NegativeException{
            setNumero(numero);
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws NegativeException{
            if(numero<0)
                throw new NegativeException("numero negativo:(");
            else if (numero<5 && numero>15) {
                throw new IntervalloException("fuori dal range:(");
            }else
                this.numero = numero;
            }
    }
