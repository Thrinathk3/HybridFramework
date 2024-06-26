package com.ktn.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.ktn.constants.FrameworkConstants;
import com.ktn.enums.ConfigProperties;
import com.ktn.exceptions.PropertyFileUsageException;

/**
 * Read the property file and store it in a HashMap for faster processing.
 * Users can prefer to use json instead of property file based on their requirement.
 * 
 * <pre>
 * <b>
 * </b>
 * </pre>
 * 
 * Jan 22, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 */
public final class PropertyUtils {

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	/**
	 * Private constructor to avoid external instantiation
	 */
	private PropertyUtils() {}

	static {
		try(FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath())) {
			property.load(file);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()); //remove the trailing and leading spaces
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} 
	}

	/**
	 * Receives the {@link com.ktn.enums.ConfigProperties},converts to lowercase , return the corresponding value
	 * for the key from the HashMap
	 * @author Thrinath K
	 * Jan 22, 2023
	 * @param key To be fetched from property file
	 * @return corresponding value for the requested key if found else {@link PropertyFileUsageException}
	 */
	public static String get(ConfigProperties key)  {
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new PropertyFileUsageException("Property name " + key + " is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}

}
