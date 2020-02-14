/**
 * 
 */
package com.pavnik.moviesdbservice.aspect;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(METHOD)
@Retention( RetentionPolicy.RUNTIME )
/**
 * @author thiruganeshkumar
 *
 */
public @interface LogExecution {

}
