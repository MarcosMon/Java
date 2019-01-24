package dni;

import java.util.HashMap;

public class TablaAsignacion {

	HashMap<Integer, String> mi_dicc = new HashMap<Integer, String>(); 
    String [] letra ={ "T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    public  void  setTablaAsignacion(){ // Este método recorre una array, pàra obtener la letra del DNI
        
        for(int posicion = 0; posicion < letra.length; posicion++){
            mi_dicc.put(posicion,letra[posicion]);//Se crea un diccionario con clave valor
            
        }
        
    }
    
    
    public  String getLetraDni(int posicion){
        return mi_dicc.get(posicion);
        
   
}
   
    
    public int getLongitudDni(){
        return this.letra.length;
    }
    public String calcularLetraDni(String digitos_dni){
        int digitos = Integer.parseInt(digitos_dni);
        int calculo = digitos % getLongitudDni();
        return getLetraDni(calculo);
        
        
    }

}