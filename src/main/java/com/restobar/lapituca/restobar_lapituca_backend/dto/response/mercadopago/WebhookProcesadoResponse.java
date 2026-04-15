package com.restobar.lapituca.restobar_lapituca_backend.dto.response.mercadopago;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WebhookProcesadoResponse {
    private String message;
}