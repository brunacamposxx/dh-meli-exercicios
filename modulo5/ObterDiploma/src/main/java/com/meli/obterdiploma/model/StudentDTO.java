package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotBlank(message = "O nome não pode ser vazio")
    @Size(min = 3, max = 50, message = "O comprimento do nome não pode exceder 50 caracteres.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do aluno deve começar com letra maiúscula.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista de matérias não pode ser vazia")
    List<@Valid SubjectDTO> subjects;
}
