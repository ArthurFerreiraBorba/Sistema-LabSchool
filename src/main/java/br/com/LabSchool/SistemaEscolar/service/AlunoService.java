package br.com.LabSchool.SistemaEscolar.service;

import br.com.LabSchool.SistemaEscolar.model.AlunoModel;
import br.com.LabSchool.SistemaEscolar.model.CursoModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class AlunoService {

    public AlunoModel cadastrarAluno(AlunoModel aluno) throws Exception {
        if (verificarAluno(aluno)) {
            return AlunoModel.adicionarAlunos(aluno);
        }
        return null;
    }

    public ArrayList<AlunoModel> verTodosAlunos() {
        return AlunoModel.getListaAlunos();
    }

    public AlunoModel buscarAlunoId(int id) throws Exception {
        return AlunoModel.buscarAlunoId(id);
    }

    private static boolean verificarAluno(AlunoModel aluno) throws Exception {
        if (!StringUtils.hasText(aluno.getNome())) {
            throw new Exception("Nome é obrigatorio");
        }
          return true;
    }
}
