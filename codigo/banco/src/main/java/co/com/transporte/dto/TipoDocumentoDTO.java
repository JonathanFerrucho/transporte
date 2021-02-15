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
public class TipoDocumentoDTO {
    
    private Long id;
    private String abreviatura;
    private String nombre;

    public TipoDocumentoDTO(Long id, String abreviatura, String nombre) {
        this.id = id;
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }

    public TipoDocumentoDTO() {
    }
}
