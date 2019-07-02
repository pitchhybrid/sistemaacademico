
package sistemaacademico.model;

public class Telefone {
    private int tipo;
    private String ddd;
    private String fone;

    public Telefone() {
    }

    public Telefone(int tipo, String ddd, String fone) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.fone = fone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
    
}
