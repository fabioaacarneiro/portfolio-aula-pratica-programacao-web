package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Usuário inválido ou não existe");
    }
}
