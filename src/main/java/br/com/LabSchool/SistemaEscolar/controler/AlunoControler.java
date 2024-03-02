package br.com.LabSchool.SistemaEscolar.controler;

import br.com.LabSchool.SistemaEscolar.model.AlunoModel;
import br.com.LabSchool.SistemaEscolar.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("aluno")
public class AlunoControler {

    private final AlunoService alunoService;

    public AlunoControler(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ArrayList<AlunoModel> get() {
        return alunoService.verTodosAlunos();
    }

    @PostMapping
    public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
        return alunoService.cadastrarAluno(aluno);
    }
}
