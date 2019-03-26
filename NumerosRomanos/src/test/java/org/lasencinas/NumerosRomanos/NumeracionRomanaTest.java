package org.lasencinas.NumerosRomanos;

import static org.assertj.core.api.Assertions.assertThat;

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

	System.out.println(valorV.getNumeroDecimal());

    }
}
