package com.ktn.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.ktn.enums.CategoryType;

/**
 * Framework Annotation is user built annotation which is annotated on top of test methods to log the author details and 
 * category details to the extent report.<p>
 * 
 * Runtime retention value indicate that this annotation will be available at run time for reflection operations.
 * 
 * <pre>
 * <b>
 * <a href="https://www.youtube.com/channel/UC6PTXUHb6j4Oxf0ccdRI11A">Testing Mini Bytes Youtube channel</a>
 * </b>
 * </pre>
 * 
 * Jan 21, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 * @see com.ktn.tests;
 * @see com.ktn.enums.CategoryType
 */


@Retention(RUNTIME)
@Target(METHOD)
@Documented
public @interface FrameworkAnnotation {
	/**
	 * Store the authors who created the tests in String[]
	 * Manadatory to enter atleast a value
	 * @author Thrinath K
	 * Jan 21, 2023
	 */
	public String[] author();
	
	/**
	 * Stores the category in form of Enum Array. Include the possible values in {@link com.ktn.enums.CategoryType}
	 * @author Thrinath K
	 * Jan 21, 2023
	 */
	public CategoryType[] category();

}
