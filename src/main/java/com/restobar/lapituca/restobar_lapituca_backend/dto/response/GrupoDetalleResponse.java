package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrupoDetalleResponse {
    private Long id;
    private String nombre;
    private String estado;
    private Integer tipoGrupo;
    private List<MesaAsignadaResponse> mesas;
}