package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MesaAsignadaResponse {
    private Long detalleMesaId;
    private Long mesaId;
    private String mesaNombre;
    private String estadoMesa;
}