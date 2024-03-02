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
    @Getter
    private static ArrayList<br.com.LabSchool.SistemaEscolar.model.CursoModel> listaCursos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    private int id;
    private String nome;
    private LocalDate dataNascimento;

    public static CursoModel adicionarCurso(br.com.LabSchool.SistemaEscolar.model.CursoModel curso) {
        curso.id = proximoId++;
        listaCursos.add(curso);
        return curso;
    }
}