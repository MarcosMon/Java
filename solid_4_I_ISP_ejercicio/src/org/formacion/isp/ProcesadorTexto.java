package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements procesable,comprobable {

    private List<String> texto = new ArrayList<>();
    
    
    public List<String> getTexto(){
	return this.texto;
    }
    
    public void setTexto(List<String> texto) {
	this.texto = texto;
    }

    @Override
    public void agregarPalabra(String palabra) {
	texto.add(palabra);
    }

    @Override
    public String textoToString() {
	return texto.stream().collect(Collectors.joining(" "));
    }
    @Override
    public boolean correcto(Idioma idioma) {
	for (String palabra : texto) {
	    if (!idioma.diccionario.contains(palabra.toLowerCase())) {
		return false;
	    }
	}
	return true;
    }
}
