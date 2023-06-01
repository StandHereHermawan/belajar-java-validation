package ariefbelajar.java.validation.constraint;

import ariefbelajar.java.validation.enums.CaseMode;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CheckCaseValidator.class})
@Target({FIELD})
@Retention(RUNTIME)
public @interface CheckCase {

    CaseMode mode();

    String message() default "invalid case format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
