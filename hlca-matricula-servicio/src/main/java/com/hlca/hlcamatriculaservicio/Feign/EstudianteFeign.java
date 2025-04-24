package com.hlca.hlcamatriculaservicio.Feign;

import com.hlca.hlcamatriculaservicio.Dto.EstudianteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hlca-estudiante-servicio", path = "/estudiantes")
public interface EstudianteFeign {
    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDto> buscarEstudiante(@PathVariable Long id);
}
