package com.dh.meli.storage01.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity // indica que esta classe será persistida no BD
@Table(name = "tb_user") // nome dado a table ano BD
public class UserBD {
    @Id // indica a PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o valor será gerado automaticamente
    private long cod;
    @Column(name = "name", length = 150, nullable = false) // nome no BD, tamanho, obrigatório // nome dado a coluna no BD
    private String name;
    @Column(name = "email", length = 100, unique = true) // nome no BD, tamanho, único
    private String email;
}
