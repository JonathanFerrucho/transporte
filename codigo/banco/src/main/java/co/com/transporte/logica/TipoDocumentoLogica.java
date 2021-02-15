/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.logica;

import co.com.transporte.dto.TipoDocumentoDTO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class TipoDocumentoLogica {

    @EJB
    DatosSingleton datosSingleton;

    public List<TipoDocumentoDTO> obtenerTodos() {
        return datosSingleton.obtenerTipoDocumento();
    }
}
