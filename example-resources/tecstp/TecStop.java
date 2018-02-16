package be.cetic.ors.ontologybinding.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultTecStop <br>
 * @version generated on Fri Sep 08 15:44:47 CEST 2017 by nm
 */
@XmlRootElement
public class TecStop {



    /* ***************************************************
     * Object Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#stop_location
     */
    TecLocation stop_location; 
    public TecLocation getStop_location() {
        return stop_location;
    }


    public void setStop_location(TecLocation newStop_location) {
        this.stop_location=newStop_location;
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#UIC
     */
     
    String UIC;
    public String getUIC() {
        return this.UIC;
    }

    public void setUIC(String newUIC) {
        this.UIC=newUIC;
    }

    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#accessibility
     */
     
    int accessibility;
    public int getAccessibility() {
		return accessibility;
    }


    public void setAccessibility(int access) {
        this.accessibility=access;
    }



    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#description_fr
     */
     
    String description_fr; 
    public String getDescription_fr() {
		return this.description_fr;
    }

    public void setDescription_fr(String newDescription_fr) {
        this.description_fr=newDescription_fr;
    }

    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#description_nl
     */
    String description_nl; 
    public String getDescription_nl() {
		return this.description_nl;
    }

    public void setDescription_nl(String newDescription_nl) {
        this.description_nl=newDescription_nl;
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#idstop
     */
    String id; 
    public String getId() {
		return id;
    }


    public void setId(String newId) {
        this.id=newId;
    }




    /* ***************************************************
     * Data Property http://www.semanticweb.org/nm/ontologies/2017/6/TECSTP#public
     */
    int ispublic;
    public int getIspublic() {
		return ispublic; 
    }


    public void setIspublic(int newPublic) {
        this.ispublic=newPublic;
    }

}
