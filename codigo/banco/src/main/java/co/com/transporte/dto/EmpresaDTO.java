/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EmpresaDTO implements Serializable{

    private Long id;
    private TipoDocumentoDTO tipoDocumentoDto;
    private Long numeroDocumento;
    private String nombre;
    private String direccion;
    private String telefono;
    private PersonaDTO reprecentante;

    public EmpresaDTO() {
    }
}
