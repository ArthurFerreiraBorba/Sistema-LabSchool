package br.com.LabSchool.SistemaEscolar.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class Professor {
    
    private static int proximoId = 1;
    private static ArrayList<Professor> listaProfessores = new ArrayList<>();

    @Setter(AccessLevel.NONE) private int id;
    private String nome;
    private String dataNascimento;

    public static Professor adicionarProfessor(Professor professor) {
        professor.id = proximoId++;
        listaProfessores.add(professor);
        return professor;
    }
}