package com.ktn.enums;

/**
 * Enums to restrict the values used on Property files. Without using enums there can be null pointer exceptions happening
 * because of typos.
 * <p>
 * Whenever a new value is added to property file, corressponding enum should be created here.
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
 * @see com.ktn.utils.PropertyUtils
 */
public enum ConfigProperties {
	
	URL,
	OVERRIDEREPORTS,
	PASSEDSTEPSSCREENSHOTS,
	FAILEDSTEPSSCREENSHOTS,
	RETRYFAILEDTESTS,
	RUNMODE,
	SENDRESULTTOELK,
	SELENIUMGRIDURL,
	ELASTICURL,
	BROWSER
	
}
