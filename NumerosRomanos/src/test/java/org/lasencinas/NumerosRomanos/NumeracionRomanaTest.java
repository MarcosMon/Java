package org.lasencinas.NumerosRomanos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lasencinas.NumerosRomanos.Enum.NumeracionRomana;

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

    @Test
    public void comprobarX() {
	NumeracionRomana x = NumeracionRomana.X;
	int posicionX = 2;

	assertThat("X").isEqualTo(x.name());
	assertThat(posicionX).isEqualTo(x.ordinal());
	assertEquals(10, x.getNumeroDecimal());
    }

}
