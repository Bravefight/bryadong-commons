/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.pingan.commons.components.enums;

/**
 * @author dongdaiming@deppon.com
 *
 * 2016年8月22日
 */
public enum ExcelTypeEnums {

	xls(2003,"Excel 2003版本"), xlsx(2007,"Excel 2007版本");
	
	private int type;
	private String desc;
	
	private ExcelTypeEnums(int type, String desc) {
		this.type = type;
		this.desc = desc;
	}
	public int type() {
		return type;
	}
	public String desc() {
		return desc;
	}
	
}
