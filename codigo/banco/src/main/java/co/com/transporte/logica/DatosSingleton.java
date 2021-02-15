/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.logica;

import co.com.transporte.dto.EmpresaDTO;
import co.com.transporte.dto.PersonaDTO;
import co.com.transporte.dto.TipoDocumentoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class DatosSingleton {

    private final List<EmpresaDTO> empresaDTOs = new ArrayList<>();
    private final List<TipoDocumentoDTO> tipoDocumentos = new ArrayList<>();
    private final List<PersonaDTO> personas = new ArrayList<>();

    public DatosSingleton() {
        tipoDocumentos.add(new TipoDocumentoDTO(1L, "CC", "Cedula de ciudadania"));
        tipoDocumentos.add(new TipoDocumentoDTO(2L, "NIT", "NIT"));
        tipoDocumentos.add(new TipoDocumentoDTO(3L, "TI", "Tarjeta Indentidad"));
        
        personas.add(new PersonaDTO(1L, tipoDocumentos.get(0),123456789L, "Juan", "", "Rodriguez", ""));
        personas.add(new PersonaDTO(2L, tipoDocumentos.get(0),123L, "Andres", "", "perez", ""));
       
    }

    public List<EmpresaDTO> guardarEmpresa(EmpresaDTO empresaDTO) {
        empresaDTOs.add(empresaDTO);
        return empresaDTOs;
    }

    public List<EmpresaDTO> obtenerEmpresa() {
        return empresaDTOs;
    }
    
    
    public List<PersonaDTO> guardarPersona(PersonaDTO personaDTO) {
        personas.add(personaDTO);
        return personas;
    }

    public List<PersonaDTO> obtenerPersona() {
        return personas;
    }
    public List<TipoDocumentoDTO> obtenerTipoDocumento() {
        return tipoDocumentos;
    }
}
