public class NumeroPositivo {
        private int numero;

    public NumeroPositivo() throws NegativeException, IntervalloException{
    }
        public NumeroPositivo(int numero) throws NegativeException, IntervalloException{
            setNumero(numero);
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws NegativeException, IntervalloException {
            if(numero<0)
                throw new NegativeException("numero negativo:(");
            else if (numero<5 || numero>15) {
                throw new IntervalloException("fuori dal range:(");
            }else
                this.numero = numero;
            }
    }
