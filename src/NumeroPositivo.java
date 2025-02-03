public class NumeroPositivo {
        private int numero;

    public NumeroPositivo() throws NegativeException, IntervalloException, NumeroEscluso{
    }
        public NumeroPositivo(int numero) throws NegativeException, IntervalloException, NumeroEscluso{
            setNumero(numero);
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws NegativeException, IntervalloException, NumeroEscluso {
            if(numero<0)
                throw new NegativeException("numero negativo:(");
            else if (numero<5 || numero>21) {
                throw new IntervalloException("fuori dal range:(");
            }else if(numero==20){
                throw new NumeroEscluso("numero 20 bro, ceh svegliati");
            }
                this.numero = numero;
            }
    }
