package br.com.LabSchool.SistemaEscolar.service;

import br.com.LabSchool.SistemaEscolar.model.CursoModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class CursoService {

    public CursoModel cadastrarCurso(CursoModel curso) throws Exception {
        if (verificarCurso(curso)) {
            return CursoModel.adicionarCurso(curso);
        }
        return null;
    }

    public ArrayList<CursoModel> verTodosCursos() {
        return CursoModel.getListaCursos();
    }

    private static boolean verificarCurso(CursoModel curso) throws Exception {
        if (!StringUtils.hasText(curso.getNome())) {
            throw new Exception("Nome é obrigatorio");
        }
          return true;
    }
}
