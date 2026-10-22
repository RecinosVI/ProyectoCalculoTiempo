
package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public boolean validarParametros(String[] parametros) {

        if (parametros.length != 5) {
            System.out.println("Error: Debe ingresar 5 parametros.");
            return false;
        }

        try {
            for (String parametro : parametros) {
                Integer.parseInt(parametro);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Todos los parametros deben ser numeros enteros.");
            return false;
        }

        return true;
    }

    public long calcularSegundos(String[] parametros) {

        long meses = Long.parseLong(parametros[0]);
        long semanas = Long.parseLong(parametros[1]);
        long dias = Long.parseLong(parametros[2]);
        long horas = Long.parseLong(parametros[3]);
        long minutos = Long.parseLong(parametros[4]);

        long totalDias = (meses * 30) + (semanas * 7) + dias;

        long totalSegundos = (totalDias * 86400)
                + (horas * 3600)
                + (minutos * 60);

        return totalSegundos;
    }
}
