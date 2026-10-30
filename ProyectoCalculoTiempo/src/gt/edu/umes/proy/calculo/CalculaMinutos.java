
package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {

        LogicaDelNegocio calculo = new LogicaDelNegocio();

        if (calculo.validarParametros(args)) {
            long resultado = calculo.calcularSegundos(args);
            System.out.println("El total calculado en segundos es: " + resultado);
        }
    }
}
