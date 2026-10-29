
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

    @Test
    void testValidarParametros() {

        LogicaDelNegocio logica = new LogicaDelNegocio();

        String[] datos = {"1", "2", "hola", "3", "20"};

        boolean resultado = logica.validarParametros(datos);

        assertFalse(resultado);
    }

    @Test
    void testCalcularSegundos() {

        LogicaDelNegocio logica = new LogicaDelNegocio();

        String[] datos = {"1", "3", "6", "20", "1"};

        long resultado = logica.calcularSegundos(datos);

        assertEquals(4996860L, resultado);
    }
}
