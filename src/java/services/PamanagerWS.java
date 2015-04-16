/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import beans.ClientFacade;
import beans.SPCatalogWrap;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Ethan
 */

@Path("pamanager")
public class PamanagerWS {
    
    
    @EJB
    ClientFacade clientFacade;
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SPCatalogWrap  getname()
    {
        return clientFacade.produceSPcataWrap();
    }
    
    
    
}
