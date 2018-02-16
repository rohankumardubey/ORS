package be.cetic.redirnet.impl;

import be.cetic.redirnet.*;


import java.net.URI;



/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultAgency <br>
 * @version generated on Fri Feb 16 14:36:20 CET 2018 by nm
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Agency {


    AgencyDepartment hasDivision;

    Resource operates;

    String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }

    /* ***************************************************
     * Object Property http://www.semanticweb.org/ontologies/2015/0/redirnet-core-ontology/hasDivision
     */
     
    public AgencyDepartment getHasDivision() {
        return this.hasDivision;
    }

    public void setHasDivision(AgencyDepartment hasDivision) {
        this.hasDivision=hasDivision;
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/ontologies/2015/0/redirnet-core-ontology/operates
     */
     
    public Resource getOperates() {
        return this.operates;
    }

    public void setOperates(Resource newOperates) {
        this.operates=newOperates;
    }

}
