import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.Object;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface CreationInfo {
	String author() default "Stephan Salinger";
	String description();
	String[] tags() default {};
	Class baseclass() default Object.class;
	Class[] interfaces() default Object.class;
}
