    
package g4s21pac8jqj;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "206 huesos","Cincuenta Estrellas","Alemania","4 años","Homero"
    };
    
    String[] radioR = {
        "206 huesos,205 huesos,209 huesos,208 huesos",
        "Cincuenta Estrellas,Cuarenta Estrellas,Sesenta Estrellas,Cincuenta y cinco Estrellas",
        "Alemania,Francia,Argentina,España",
        "4 años,5 años,3 años,6 de años",
        "Homero,Bart,Lisa,Maggie"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
