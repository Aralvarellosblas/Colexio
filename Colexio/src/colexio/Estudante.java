package colexio;

/**
 * @author Arturo
 */
public class Estudante extends Persona{

    private String nomeCole;
    private int nivel;

    public Estudante(){
    }

    public Estudante(String nomeCole, int nivel, String nome, String direccion){
        super(nome, direccion);
        this.nomeCole=nomeCole;
        this.nivel=nivel;
    }

    public String getNomeCole(){
        return nomeCole;
    }

    public void setNomeCole(String nomeCole){
        this.nomeCole=nomeCole;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel=nivel;
    }

    @Override
    public String toString(){
        return (super.toString() + "Nome Colexio: " + nomeCole + "\nNivel: " + nivel + "\n");
    }
}
