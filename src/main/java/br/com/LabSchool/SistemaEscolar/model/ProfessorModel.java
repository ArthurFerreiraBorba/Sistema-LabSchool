package br.com.LabSchool.SistemaEscolar.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class ProfessorModel {
    
    private static int proximoId = 1;
    @Getter private static ArrayList<ProfessorModel> listaProfessores = new ArrayList<>();

    @Setter(AccessLevel.NONE) private int id;
    private String nome;
    private LocalDate dataNascimento;

    public static ProfessorModel adicionarProfessor(ProfessorModel professor) {
        professor.id = proximoId++;
        listaProfessores.add(professor);
        return professor;
    }
}