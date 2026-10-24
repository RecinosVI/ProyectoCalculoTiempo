
package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public boolean validarParametros(String[] datos) {

        if (datos.length != 5) {
            System.out.println("Error: Debe ingresar 5 parametros.");
            return false;
        }

        for (int i = 0; i < datos.length; i++) {
            try {
                Integer.parseInt(datos[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Todos los parametros deben ser numeros enteros.");
                return false;
            }
        }

        return true;
    }

    public long calcularSegundos(String[] datos) {

        int mes = Integer.parseInt(datos[0]);
        int semana = Integer.parseInt(datos[1]);
        int dia = Integer.parseInt(datos[2]);
        int hora = Integer.parseInt(datos[3]);
        int minuto = Integer.parseInt(datos[4]); 

        long segundosMes = mes * 30L * 24 * 60 * 60;
        long segundosSemana = semana * 7L * 24 * 60 * 60;
        long segundosDia = dia * 24L * 60 * 60;
        long segundosHora = hora * 60L * 60;
        long segundosMinuto = minuto * 60L;

        long resultado = segundosMes + segundosSemana + segundosDia
                + segundosHora + segundosMinuto;

        return resultado;
    }
}

//Comentario cambio del 23 de octubre

