package br.uniesp.si.techback.validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class SenhaUsuarioValidator implements ConstraintValidator<SenhaUsuarioNoEmail, String> {

    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {
        if (Objects.nonNull(valor) && valor.()){
            return true; // @NotNull deve ser usado separadamente se necessário
        }
        return false;
    }
}