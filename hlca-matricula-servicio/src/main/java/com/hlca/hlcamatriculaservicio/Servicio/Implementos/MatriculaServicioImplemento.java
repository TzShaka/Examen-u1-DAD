package com.hlca.hlcamatriculaservicio.Servicio.Implementos;

import com.hlca.hlcamatriculaservicio.Entidad.Matricula;
import com.hlca.hlcamatriculaservicio.Feign.CursoFeign;
import com.hlca.hlcamatriculaservicio.Feign.EstudianteFeign;
import com.hlca.hlcamatriculaservicio.Repositorio.MatriculaRepositorio;
import com.hlca.hlcamatriculaservicio.Servicio.MatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServicioImplemento implements MatriculaServicio {



    @Autowired
    private MatriculaRepositorio matriculaRepositorio;

    @Override
    public List<Matricula> Listar(){
        return matriculaRepositorio.findAll();
    }

    @Override
    public Matricula Buscar(Long id){
        Optional<Matricula> matriculaOptional = matriculaRepositorio.findById(id);
        return null;
    }

    @Override
    public Matricula Guardar(Matricula matricula){
        return matriculaRepositorio.save(matricula);
    }

    @Override
    public Matricula Actualizar(Matricula matricula){
        return matriculaRepositorio.save(matricula);
    }

    @Override
    public Matricula Eliminar(Matricula matricula){
        matriculaRepositorio.delete(matricula); // Usamos delete() para eliminar
        return matricula; // Puedes retornar void si prefieres
    }


}
