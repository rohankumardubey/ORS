package be.cetic.redirnet.impl;

import be.cetic.redirnet.*;


import java.net.URI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: RoadCollision <br>
 * @version generated on Fri Feb 16 14:36:20 CET 2018 by nm
 */
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class RoadCollision {


     String id;

     public String getId() {
         return this.id;
     }

     public void setId(String id) {
         this.id=id;
     }

     LOCATION eventLocation;

    /* ***************************************************
     * Object Property http://www.semanticweb.org/ontologies/2015/0/redirnet-core-ontology/eventLocation
     */
     
    public LOCATION getEventLocation() {
        return this.eventLocation;
    }

    public void setEventLocation(LOCATION newEventLocation) {
        this.eventLocation=newEventLocation;
    }


    ControlCentre managedBy;

    /* ***************************************************
     * Object Property http://www.semanticweb.org/ontologies/2015/0/redirnet-core-ontology/managedBy
     */
     
    public ControlCentre getManagedBy() {
        return this.managedBy;
    }

    public void setManagedBy(ControlCentre newManagedBy) {
        this.managedBy=newManagedBy;
    }

    String eventCode;

    /* ***************************************************
     * Data Property http://www.semanticweb.org/ontologies/2015/0/redirnet-core-ontology#eventCode
     */
     
    public String getEventCode() {
        return this.eventCode;
    }

    public void setEventCode(String newEventCode) {
        this.eventCode=newEventCode;
    }


}
