package Herencia2;
/*
    nivel de la cadena alimenticioa: segundo o 2
    tipo de herbivoro: pastores(comen hiervas y plantas pequeñas serca del suelo) o los navegadores(los que
comen hojas, brotes y ramitas) los animales grandes son los dos tipos (elefante, alces y rinocerontes)
*/
public class Herbivoros extends Animales{
    private int nivelCadenaAlimenticia;
    private String tipoHerbivoros;
    public Herbivoros(){
        nivelCadenaAlimenticia=0;
        tipoHerbivoros="";
    }
    public Herbivoros(String tipo, String tipoDesarrollo, String tipoReproduccion, String organismosCelulares,
            String tipoAlimentacion, String tipoDeVida,int nivelCadenaAlimenticia, String tipoHerbivoros){
        super(tipo,tipoDesarrollo,tipoReproduccion,organismosCelulares,tipoAlimentacion,tipoDeVida);
        this.nivelCadenaAlimenticia=nivelCadenaAlimenticia;
        this.tipoHerbivoros=tipoHerbivoros;
    }

    /**
     * @return the nivelCadenaAlimenticia
     */
    public int getNivelCadenaAlimenticia() {
        return nivelCadenaAlimenticia;
    }

    /**
     * @param nivelCadenaAlimenticia the nivelCadenaAlimenticia to set
     */
    public void setNivelCadenaAlimenticia(int nivelCadenaAlimenticia) {
        this.nivelCadenaAlimenticia = nivelCadenaAlimenticia;
    }

    /**
     * @return the tipoHerbivoros
     */
    public String getTipoHerbivoros() {
        return tipoHerbivoros;
    }

    /**
     * @param tipoHerbivoros the tipoHerbivoros to set
     */
    public void setTipoHerbivoros(String tipoHerbivoros) {
        this.tipoHerbivoros = tipoHerbivoros;
    }
    public void mostrarDatos(){
        System.out.println("tipo: "+getTipo()+"\ntipo de desarrolli:"+getTipoDesarrollo()+"\ntipoReproduccion"+getTipoReproduccion()+
                "\norganismo celulares:"+getOrganismosCelulares()+"\ntipo de alimento:"+getTipoAliemntacion()+"\ntipo de vida:"+getTipoDeVida()+
                "\nnivel de cadena alimenticia: "+getNivelCadenaAlimenticia()+"\ntipo de herbivoro"+getTipoHerbivoros());
    }
}
