package ariefbelajar.java.validation.constraint;

import ariefbelajar.java.validation.enums.CaseMode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

    private CaseMode caseMode;

    @Override
    public void initialize(CheckCase constraintAnnotation) {
        caseMode = constraintAnnotation.mode();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true; // not validate null value

        if (caseMode == CaseMode.UPPER) {
            return value.equals(value.toUpperCase());
        } else if (caseMode == CaseMode.LOWER) {
            return value.equals(value.toLowerCase());
        }

        return false;
    }
}
