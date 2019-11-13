package Herencia2;
/*
OrfanismoCelular:unicelulares o pluricelular
Tipo de desarrollo: mamiferos:Feed Back *negativo o metamorfosis insectos
Tipo de reproducción: asexual y sexual
Tipo:mamífero insecto 
*/
public class Seresvivos {
	private String tipo;
	private String tipoDesarrollo;
	private String tipoReproduccion;
	private String organismosCelulares;
	public Seresvivos(){
	  tipo="";
	  tipoDesarrollo="";
	  tipoReproduccion="";
	  organismosCelulares="";
	}
	public Seresvivos(String tipo, String tipoDesarrollo, String tipoReproduccion, String organismosCelulares){
	  this.tipo=tipo;
	  this.tipoDesarrollo=tipoDesarrollo;
	  this.tipoReproduccion=tipoReproduccion;
	  this.organismosCelulares=organismosCelulares;
	}
	public String getTipo(){
	  return tipo;
}
	public void setTipo(String tipo){
            this.tipo=tipo;
        }

    /**
     * @return the tipoDesarrollo
     */
    public String getTipoDesarrollo() {
        return tipoDesarrollo;
    }

    /**
     * @param tipoDesarrollo the tipoDesarrollo to set
     */
    public void setTipoDesarrollo(String tipoDesarrollo) {
        this.tipoDesarrollo = tipoDesarrollo;
    }

    /**
     * @return the tipoReproduccion
     */
    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    /**
     * @param tipoReproduccion the tipoReproduccion to set
     */
    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    /**
     * @return the organismosCelulares
     */
    public String getOrganismosCelulares() {
        return organismosCelulares;
    }

    /**
     * @param organismosCelulares the organismosCelulares to set
     */
    public void setOrganismosCelulares(String organismosCelulares) {
        this.organismosCelulares = organismosCelulares;
    }
        
}
