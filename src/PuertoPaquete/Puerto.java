//Diego Fuentes Ramirez
package PuertoPaquete;

public class Puerto {

    private Hub[] puerto = new Hub[3];

    public Puerto() {
        for(int i = 0; i < this.puerto.length; ++i) {
            this.puerto[i] = new Hub();
        }

    }
    public void buscaContenHub(int prio, Hub[][] hub){
        for (int i = 0; i< hub.length; i++) {
            if(hub[hub.length][hub.length] != null ){
                hub[hub.length][hub.length].toString();
            }

        }
    }

}
