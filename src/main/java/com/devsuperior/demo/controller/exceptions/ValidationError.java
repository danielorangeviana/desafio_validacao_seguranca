package com.devsuperior.demo.controller.exceptions;

import java.util.ArrayList;
import java.util.List;

/* UTILIZADO APENAS PARA ERROS DE VALIDAÇÃO QUE NÃO PRECISAM ACESSAR O BANCO DE DADOS
 * FICANDO APENAS NA ESFERA DA CAMADA CONTROLLER
 */

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	List<FieldMessage> errors = new ArrayList<>();

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}
