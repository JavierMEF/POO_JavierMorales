package Herencia2;
/*
    tipo de carnivoro: hipercarnivoro 70% y hipocarnivoro 30% de carne consumida
*/
public class Carnivoros extends Animales{
    private String tipoCarnivoro;
    public Carnivoros(){
        tipoCarnivoro="";
    }
    public Carnivoros(String tipo, String tipoDesarrollo, String tipoReproduccion, String organismosCelulares,
            String tipoAlimentacion, String tipoDeVida, String tipoCarnivoro){
        super(tipo,tipoDesarrollo,tipoReproduccion,organismosCelulares,tipoAlimentacion,tipoDeVida);
        this.tipoCarnivoro=tipoCarnivoro;
    }

    /**
     * @return the tipoCarnivoro
     */
    public String getTipoCarnivoro() {
        return tipoCarnivoro;
    }

    /**
     * @param tipoCarnivoro the tipoCarnivoro to set
     */
    public void setTipoCarnivoro(String tipoCarnivoro) {
        this.tipoCarnivoro = tipoCarnivoro;
    }
    public void mostrarDatos(){
        System.out.println("tipo: "+getTipo()+"\ntipo de desarrolli:"+getTipoDesarrollo()+"\ntipoReproduccion"+getTipoReproduccion()+
                "\norganismo celulares:"+getOrganismosCelulares()+"\ntipo de alimento:"+getTipoAliemntacion()+"\ntipo de vida:"+getTipoDeVida()+
                "\ntipo de carnivoro: "+getTipoCarnivoro());
    }
}
