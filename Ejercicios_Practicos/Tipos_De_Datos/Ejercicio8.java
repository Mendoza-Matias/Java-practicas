/**/
package matias.tiposdedatos;
public class Ejercicio8 {
    public static void main(String[]args){
    
        //Declaro mis variables
    char letra1 = 'M',letra2='A',letra3='T',letra4='I';
    
    
    String letraStringUno,letraStringDos,letraStringTres,letraStringCuatro,nombreCompleto;
    
     letraStringUno = Character.toString(letra1);
     letraStringDos = Character.toString(letra2);
     letraStringTres = Character.toString(letra3);
     letraStringCuatro = Character.toString(letra4);
     
     nombreCompleto = letraStringUno+letraStringDos+letraStringTres+letraStringCuatro;
     
     System.out.println("Mi nombre es : " + nombreCompleto);
    
    
    
    }
}
