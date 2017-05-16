/**
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.pingan.commons.components.exception;

/**
 * @author Demon
 * @date 2016年12月11日
 */
public class DataConvertException extends Exception {

	private static final long serialVersionUID = -2530396868104807601L;

	/**
	 * 
	 */
	public DataConvertException() {
		super();

	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DataConvertException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	/**
	 * @param message
	 * @param cause
	 */
	public DataConvertException(String message, Throwable cause) {
		super(message, cause);

	}

	/**
	 * @param message
	 */
	public DataConvertException(String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public DataConvertException(Throwable cause) {
		super(cause);

	}

}
