package br.com.LabSchool.SistemaEscolar.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class CursoModel {

    private static int proximoId = 1;
    @Getter private static ArrayList<CursoModel> listaCursos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    private int id;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<AlunoModel> alunosmatriculados = new ArrayList<>();

    public static boolean adicionarAlunoCurso(CursoModel curso, AlunoModel aluno) throws Exception {
        curso.alunosmatriculados.add(aluno);
        return true;
    }

    public static CursoModel adicionarCurso(CursoModel curso) {
        curso.id = proximoId++;
        listaCursos.add(curso);
        return curso;
    }

    public static CursoModel buscarCursoId(int id) throws Exception {
        for (CursoModel curso : listaCursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        throw new Exception("Aluno não encontrado");
    }

}