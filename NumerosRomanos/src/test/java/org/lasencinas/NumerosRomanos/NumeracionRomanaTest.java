package org.lasencinas.NumerosRomanos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeracionRomanaTest {

    @Test
    public void comprobarCantidadLetras() {
	int letrasRomanas = 7;
	assertThat(letrasRomanas).isEqualTo(NumeracionRomana.values().length);
    }

    @Test
    public void comprobarValorV() {
	NumeracionRomana valorV = NumeracionRomana.V;

	assertEquals(5, valorV.getNumeroDecimal());

    }

}
