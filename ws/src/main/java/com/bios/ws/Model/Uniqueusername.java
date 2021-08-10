package com.bios.ws.Model;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = { UniqueusernameValidator.class})
public @interface Uniqueusername {
	
	String message() default "{E-mail must be unique}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };


}
