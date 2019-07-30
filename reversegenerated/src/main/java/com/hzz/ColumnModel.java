package com.hzz;


public class ColumnModel {
	//列名
	private String columnName;
	//数据类型
	private String dataType;
   // 类型名称
	private String typeName;
   //列类名称
	private String columnClassName;
	// 属性名称
	private String fieldName;
	//属性类型
	private String fieldType;
	//类长度
	private int columnSize;
	
	private String columnDef;
	//注释
	private String remarks;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getColumnSize() {
		return columnSize;
	}

	public void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "ColumnModel [columnName=" + columnName + ", dataType="
				+ dataType + ", typeName=" + typeName + ", columnClassName="
				+ columnClassName + ", fieldName=" + fieldName + ", fieldType="
				+ fieldType + ", columnSize=" + columnSize + ", columnDef="
				+ columnDef + ", remarks=" + remarks + "]";
	}

	public String getColumnDef() {
		return columnDef;
	}

	public void setColumnDef(String columnDef) {
		this.columnDef = columnDef;
	}

	public String getColumnClassName() {
		return columnClassName;
	}

	public void setColumnClassName(String columnClassName) {
		this.columnClassName = columnClassName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

}
