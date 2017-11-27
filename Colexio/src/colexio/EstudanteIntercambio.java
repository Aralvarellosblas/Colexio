package colexio;

/**
 * @author Arturo
 */
public class EstudanteIntercambio extends Estudante{

    private String pais;

    public EstudanteIntercambio(){
    }

    public EstudanteIntercambio(String pais, String nomeCole, int nivel, String nome, String direccion){
        super(nomeCole, nivel, nome, direccion);
        this.pais=pais;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais=pais;
    }

    @Override
    public String toString(){
        return (super.toString() + "Pais: " + pais+"\n");
    }

}
