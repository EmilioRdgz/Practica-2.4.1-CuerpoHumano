public class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumano() {
        this.corazon = new Corazon();
        this.pulmonIzquierdo = new Pulmon();
        this.pulmonDerecho = new Pulmon();
        this.higado = new Higado();
        this.apendice = new Apendice();
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public Higado getHigado() {
        return higado;
    }

    public Apendice getApendice() {
        return apendice;
    }
}
