package org.radarbase.authorizer.validation.exception;

import org.radarbase.authorizer.validation.Validator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class ValidationFailedException extends RuntimeException {

  public ValidationFailedException(Object entity, Validator validator) {
    super(
        "Validation Failed for [" + entity + "] using Validator [" + validator.getClass().getName()
            + "].");
  }
}
