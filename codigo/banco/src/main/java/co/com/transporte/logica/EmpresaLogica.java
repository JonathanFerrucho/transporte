/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.logica;

import co.com.transporte.dto.EmpresaDTO;
import co.com.transporte.dto.MensajeDTO;
import co.com.transporte.util.Constantes;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Dmoviliza
 */
@Stateless
public class EmpresaLogica {

    @EJB
    DatosSingleton datosSingleton;

    public MensajeDTO guardar(EmpresaDTO empresaDTO) {
        datosSingleton.guardarEmpresa(empresaDTO);

        return new MensajeDTO(Constantes.CodigosRespuesta.EXITOSO, "Se creo la empresa con exito");
    }

    public List<EmpresaDTO> obtenerTodos() {
        return datosSingleton.obtenerEmpresa();
    }
}
