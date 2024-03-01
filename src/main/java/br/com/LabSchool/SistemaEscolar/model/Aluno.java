package br.com.LabSchool.SistemaEscolar.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class Aluno {

    private static int proximoId = 1;
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();

    @Setter(AccessLevel.NONE) private int id;
    private String nome;
    private String dataNascimento;

    public static Aluno adicionarAlunos(Aluno aluno) {
        aluno.id = proximoId++;
        listaAlunos.add(aluno);
        return aluno;
    }
}
