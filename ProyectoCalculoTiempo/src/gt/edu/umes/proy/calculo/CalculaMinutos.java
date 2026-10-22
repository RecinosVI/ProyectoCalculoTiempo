
package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {

        LogicaDelNegocio logica = new LogicaDelNegocio();

        if (logica.validarParametros(args)) {

            long segundos = logica.calcularSegundos(args);

            System.out.println("Total en segundos: " + segundos);
        }
    }
}
