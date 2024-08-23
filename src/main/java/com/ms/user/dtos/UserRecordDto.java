package com.ms.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

//Passar atributos como parâmetros
//@NotBlank : não permite que o usuário não envie com nome e email vazio

public record UserRecordDto(@NotBlank String name,
                            @NotBlank @Email String email) {

}
