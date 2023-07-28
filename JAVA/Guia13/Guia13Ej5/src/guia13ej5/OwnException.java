package guia13ej5;

/**
 *
 * @author CASA
 */
class OwnException extends Exception {

    protected String mensaje;
    protected int num;
    
    public OwnException() {
    }

    public OwnException(int num, String string) {
        super(string);
        this.mensaje = "Acordate que son numeros enteros del 1 al 500";
        this.num = num;
    }

    public String getMensaje() {
        return mensaje;
            }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


public String generarRespuesta (){
String resp="";
    if (num>500){
        resp = "--El numero ingresado es mayor a 500--";
    }
    else if(num<1){
        resp = "--El numero ingresado es menor a 1--";
    }
       return resp;
    }
}
