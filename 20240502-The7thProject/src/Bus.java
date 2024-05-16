public class Bus {

    private int Prefixo;
    private String ModeloBus;
    private String AnoBus;


    public Bus(int prefixo, String modeloBus, String anoBus) {
        Prefixo = prefixo;
        ModeloBus = modeloBus;
        AnoBus = anoBus;

    }

    public int getPrefixo() {
        return Prefixo;
    }

    public void setPrefixo(int prefixo) {
        Prefixo = prefixo;
    }

    public String getModeloBus() {
        return ModeloBus;
    }

    public void setModeloBus(String modeloBus) {
        ModeloBus = modeloBus;
    }

    public String getAnoBus() {
        return AnoBus;
    }

    public void setAnoBus(String anoBus) {
        AnoBus = anoBus;
    }

}

