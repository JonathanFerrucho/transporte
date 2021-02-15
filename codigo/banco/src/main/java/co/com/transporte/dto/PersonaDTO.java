/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PersonaDTO {

    private Long id;
    private TipoDocumentoDTO tipoDocumentoDto;
    private Long numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String telefono;

    public PersonaDTO(Long id, TipoDocumentoDTO tipoDocumentoDto, Long numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.id = id;
        this.tipoDocumentoDto = tipoDocumentoDto;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public PersonaDTO() {
    }
    
    
    
}
