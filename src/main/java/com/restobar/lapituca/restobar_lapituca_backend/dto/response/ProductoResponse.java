package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProductoResponse {
    private Long id;
    private String nombre;
    private BigDecimal precio;
    private Integer stock;
    private CategoriaResponse categoria;
    private MarcaResponse marca;
}

