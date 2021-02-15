/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.transporte.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MensajeDTO {

    private String codigoResultado;
    private String mensaje;

    public MensajeDTO(String codigoResultado, String mensaje) {
        this.codigoResultado = codigoResultado;
        this.mensaje = mensaje;
    }

    public MensajeDTO() {
    }
}
