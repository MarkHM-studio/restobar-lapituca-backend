package com.restobar.lapituca.restobar_lapituca_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleMesaResponse {
    private Long id;
    private Long grupoId;
    private Long mesaId;
}
