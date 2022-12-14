package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotEmpty(message = "O nome do assunto não pode ficar vazio.")
    @Size(min = 3, max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do assunto deve começar com letra maiúscula.")
    String name;
    @NotNull(message = "A nota não pode ficar vazia.")
    @Min(value = 0L, message = "A nota mínima é 0.")
    @Max(value = 10L, message = "A nota máxima é 10.")
    Double score;
}
