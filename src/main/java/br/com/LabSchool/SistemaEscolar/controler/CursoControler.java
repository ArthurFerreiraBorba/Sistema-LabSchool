package br.com.LabSchool.SistemaEscolar.controler;

import br.com.LabSchool.SistemaEscolar.model.CursoModel;
import br.com.LabSchool.SistemaEscolar.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("curso")
public class CursoControler {

    private final CursoService cursoService;

    public CursoControler(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public ArrayList<CursoModel> get() {
        return cursoService.verTodosCursos();
    }

    @PostMapping
    public CursoModel post(@RequestBody CursoModel curso) throws Exception {
        return cursoService.cadastrarCurso(curso);
    }
}
