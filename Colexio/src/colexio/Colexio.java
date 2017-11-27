package colexio;

/**
 * @author Arturo
 */
public class Colexio{

    public static void main(String[] args){
        //Creamos los objetos con el contructor con valores
        Estudante est1=new Estudante("Daniel Castelao", 1, "Arturo Alvarellos", "Vigo");
        Ensinante ens1=new Ensinante("Ingeniería", "Ray Palmer", "L.A.");
        EstudanteIntercambio estui1=new EstudanteIntercambio("UK", "Daniel Castelao", 1, "Sherlock Holmes", "London");
        //Mostramos los datos
        System.out.println(est1.toString());
        System.out.println(ens1.toString());
        System.out.println(estui1.toString());
        //Modificamos los datos
        est1.setNivel(2);
        ens1.setMateria("Nano-ingeniería");
        //Mostramos los datos de nuevo
        System.out.println(est1.toString());
        System.out.println(ens1.toString());
        System.out.println(estui1.toString());

    }

}
