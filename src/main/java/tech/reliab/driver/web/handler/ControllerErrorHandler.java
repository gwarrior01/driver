package tech.reliab.driver.web.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice
public class ControllerErrorHandler extends ResponseEntityExceptionHandler {

    //    @ExceptionHandler
    protected ResponseEntity<Object> handleError(RuntimeException ex, WebRequest request) {
        System.out.println();
        return handleExceptionInternal(ex, ex.getMessage(),
                new HttpHeaders(), HttpStatus.SERVICE_UNAVAILABLE, request);
    }
}
