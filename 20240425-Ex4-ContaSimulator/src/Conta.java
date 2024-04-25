public class Conta {

    private int number;
    private  String client;
    private float saldo;

    public Conta(int number, String client, float saldo) {
        this.number = number;
        this.client = client;
        this.saldo = saldo;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor){

        setSaldo(getSaldo()-valor);
    }
    public void depositar(float valor){

        setSaldo(getSaldo()+valor);
    }

}
