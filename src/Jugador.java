public class Jugador {
    String nombre;
    int edad;
    String nomEquipo;
    double peso;
    double altura;
    /*Constructor*/ //Sirve para setear los principales objetos
    public Jugador(){
        nombre = "Danny Vinueza";
        edad = 20;
        nomEquipo = "Liga";
        peso = 132.2;
        altura = 1.80;
    }

    /*Metodos*/
    public void correr(){

    }

    public void entrenar(){

    }

    public void leciones(){

    }

    public void posicionJuego(){

    }

    /*public void setearNombre(String nombre){//Setters
        //Puntero this apunta a mi mismo
        this.nombre = nombre;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
/*public String obtenerNombre(){//Getters
        return nombre;
    }*/
}
