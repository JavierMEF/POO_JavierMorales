package Herencia2;
/*
    tipo de alimentacion: carnivoro hervivoro omnivoros
    tipo de vida: acuatico aereo terrestre
*/
public class Animales extends Seresvivos{
    private String tipoAliemntacion;
    private String tipoDeVida;
    
    public Animales(){
        tipoAliemntacion="";
        tipoDeVida="";
    }
    public Animales(String tipo, String tipoDesarrollo, String tipoReproduccion, String organismosCelulares,
            String tipoAlimentacion, String tipoDeVida){
        super(tipo,tipoDesarrollo,tipoReproduccion,organismosCelulares);
        this.tipoAliemntacion=tipoAlimentacion;
        this.tipoDeVida=tipoDeVida;
    }

    /**
     * @return the tipoAliemntacion
     */
    public String getTipoAliemntacion() {
        return tipoAliemntacion;
    }

    /**
     * @param tipoAliemntacion the tipoAliemntacion to set
     */
    public void setTipoAliemntacion(String tipoAliemntacion) {
        this.tipoAliemntacion = tipoAliemntacion;
    }

    /**
     * @return the tipoDeVida
     */
    public String getTipoDeVida() {
        return tipoDeVida;
    }

    /**
     * @param tipoDeVida the tipoDeVida to set
     */
    public void setTipoDeVida(String tipoDeVida) {
        this.tipoDeVida = tipoDeVida;
    }
    
}
