package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsumoDetalleEnMovimientoResponse {
    private Long id;
    private String nombre;
    private String unidad_medida;
    private BigDecimal stock;
}