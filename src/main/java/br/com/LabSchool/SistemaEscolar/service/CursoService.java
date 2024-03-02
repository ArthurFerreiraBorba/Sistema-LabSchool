package br.com.LabSchool.SistemaEscolar.service;

import br.com.LabSchool.SistemaEscolar.model.AlunoModel;
import br.com.LabSchool.SistemaEscolar.model.CursoModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class CursoService {

    private final AlunoService alunoService;

    public CursoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public CursoModel cadastrarCurso(CursoModel curso) throws Exception {
        if (verificarCurso(curso)) {
            return CursoModel.adicionarCurso(curso);
        }
        return null;
    }

    public ArrayList<CursoModel> verTodosCursos() {
        return CursoModel.getListaCursos();
    }

    private boolean verificarCurso(CursoModel curso) throws Exception {
        if (!StringUtils.hasText(curso.getNome())) {
            throw new Exception("Nome é obrigatorio");
        }
          return true;
    }

    private CursoModel buscarCursoId(int id) throws Exception {
        return CursoModel.buscarCursoId(id);
    }

    public boolean adicionarAlunoCurso(int id, int idAluno) throws Exception {
        AlunoModel aluno = alunoService.buscarAlunoId(idAluno);
        CursoModel curso = buscarCursoId(id);
        return CursoModel.adicionarAlunoCurso(curso, aluno);
    }
}
