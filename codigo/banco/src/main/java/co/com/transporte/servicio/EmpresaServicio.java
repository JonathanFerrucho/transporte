/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.servicio;

import co.com.transporte.dto.EmpresaDTO;
import co.com.transporte.dto.MensajeDTO;
import co.com.transporte.logica.EmpresaLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/empresa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmpresaServicio {

    @EJB
    private EmpresaLogica logica;

    @GET
    @Path("/prueba")
    public boolean conexion() {
        return true;
    }
    
    
    @GET
    @Path("/obtenerTodos")
    public List<EmpresaDTO> obtener() {
        return logica.obtenerTodos();
    }
    
    @POST
    @Path("/guardar")
    public MensajeDTO guardar(EmpresaDTO empresaDTO) {
        return logica.guardar(empresaDTO);
    }

}
