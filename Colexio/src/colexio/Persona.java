package colexio;

/**
 * @author Arturo
 */
public class Persona{

    private String nome, direccion;

    public Persona(){
    }

    public Persona(String nome, String direccion){
        this.nome=nome;
        this.direccion=direccion;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    @Override
    public String toString(){
        return ("Nome: " + nome + "\nDirección: " + direccion + "\n");
    }
}
