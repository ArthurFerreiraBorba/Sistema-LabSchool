package br.com.LabSchool.SistemaEscolar.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class AlunoModel {

    private static int proximoId = 1;
    @Getter private static ArrayList<AlunoModel> listaAlunos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    private int id;
    private String nome;
    private LocalDate dataNascimento;

    public static AlunoModel adicionarAlunos(AlunoModel aluno) {
        aluno.id = proximoId++;
        listaAlunos.add(aluno);
        return aluno;
    }
}