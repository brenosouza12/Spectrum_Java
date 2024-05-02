public class Bus {

    private int Prefixo;
    private String ModeloBus;
    private String chassiBus;
    private String AnoBus;
    private String placaBus;

    public Bus(int prefixo, String modeloBus,String chassiBus, String anoBus, String placaBus) {
        Prefixo = prefixo;
        ModeloBus = modeloBus;
        chassiBus = chassiBus;
        AnoBus = anoBus;
        this.placaBus = placaBus;
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

    public String getPlacaBus() {
        return placaBus;
    }

    public void setPlacaBus(String placaBus) {
        this.placaBus = placaBus;
    }
}

