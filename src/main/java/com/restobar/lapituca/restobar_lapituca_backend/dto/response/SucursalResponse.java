package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SucursalResponse {
    private Long id;
    private String nombre;
    private String direccion;
    private String RUC;
    private LocalDateTime fechaHora_registro;
    private LocalDateTime fechaHora_actualizacion;
}
