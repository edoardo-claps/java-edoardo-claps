package Esercizio.esercizio3;

public class ContoCorrente {
    private String titolare;
    private String iban;
    private Double saldo;

    public ContoCorrente(String titolare, String iban, Double saldo) {
        this.titolare = titolare;
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

/**
 *@param a somma da depositare
 * */
    public void deposito(Double a){
        if(a>=0) {
            this.saldo = this.saldo + a;
        }
        else {
            System.out.println("Non puoi depositare una somma di denaro negativa");
        }
    }

    /**
     * @param a somma da prelevare
     * @return saldo decurtato
     * */
    public Double prelievo(double a) {
        if (this.saldo>=a && a>0) {
            this.saldo= this.saldo - a;
            return a;
        }
        else{
            System.out.println("non puoi prelevare piu di quanto hai");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolare='" + titolare + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
