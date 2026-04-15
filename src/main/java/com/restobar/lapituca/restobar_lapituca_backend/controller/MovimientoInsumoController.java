package com.restobar.lapituca.restobar_lapituca_backend.controller;

import com.restobar.lapituca.dto.response.MovimientoInsumoDetalleResponse;
import com.restobar.lapituca.dto.response.MovimientoInsumoListadoResponse;
import com.restobar.lapituca.service.MovimientoInsumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movimiento-insumo")
public class MovimientoInsumoController {

    private final MovimientoInsumoService movimientoInsumoService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMINISTRADOR', 'CAJERO')")
    public ResponseEntity<List<MovimientoInsumoListadoResponse>> listar() {
        return ResponseEntity.ok(movimientoInsumoService.listar());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMINISTRADOR', 'CAJERO')")
    public ResponseEntity<MovimientoInsumoDetalleResponse> obtenerDetalle(@PathVariable Long id) {
        return ResponseEntity.ok(movimientoInsumoService.obtenerDetalle(id));
    }
}