package com.example.demo.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValBody.class})
public @interface CardNumberVa {
    String message() default "{aaa.bbb}";
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
