package com.ktn.enums;

/**
 * Enums to restrict the users to choose an appropriate waiting strategy before operating an element.
 * 
 * <pre>
 * <b>
 * </b>
 * </pre>
 * 
 * Jan 21, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 * @see com.ktn.factories.ExplicitWaitFactory
 * @see com.ktn.pages.BasePage
 */
public enum WaitStrategy {
	
	
	CLICKABLE,
	PRESENCE,
	VISIBLE,
	NONE

}
