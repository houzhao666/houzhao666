package com.hzz;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


	

public class CreatedJavaClassBiz {
	
	/**
	 * 获取表结构
	 * @param tableName
	 * @return
	 */
	public static List<ColumnModel> getTableStructure(String tableName){
		List<ColumnModel> columnModelList = new ArrayList<>();
		try {
			ResultSet columnSet = DBManager.getConnection().getMetaData().getColumns(null,"%",tableName,"%");
			ColumnModel columnModel = null;
			while(columnSet.next()){
				columnModel = new ColumnModel();
				columnModel.setColumnName(columnSet.getString("COLUMN_NAME"));
				columnModel.setColumnSize(columnSet.getInt("COLUMN_SIZE"));
				columnModel.setDataType(columnSet.getString("DATA_TYPE"));
				columnModel.setRemarks(columnSet.getString("REMARKS"));
				columnModel.setTypeName(columnSet.getString("TYPE_NAME"));
				String columnClassName = ColumnTypeEnum.getColumnTypeEnumByDBType(columnModel.getTypeName());
				String fieldName = getFieldName(columnModel.getColumnName());
				String fieldType = Class.forName(columnClassName).getSimpleName();
				columnModel.setFieldName(fieldName);
				columnModel.setColumnClassName(columnClassName);
				columnModel.setFieldType(fieldType);
    			columnModelList.add(columnModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return columnModelList;
	}
	
	/**
	 * 将数据库字段转换成bean属性
	 * @param columnName
	 * @return
	 */
	private static String getFieldName(String columnName) {
		char[]  columnCharArr = columnName.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();
		int ad = -1;
		for (int i = 0; i < columnCharArr.length; i++) {
			  char cur = columnCharArr[i];
			  if(cur=='_'){
				  ad = i;
			  }else{
				  if((ad+1)==i&&ad!=-1){
					  sb.append(Character.toUpperCase(cur));
				  }else{
					  sb.append(cur);
				  }
				  ad=-1;
			  }
		}
		return sb.toString();
	}
	
	/**
	 * 从表结构中去生成javabean
	 * @param structureList
	 * @param beanName
	 * @return
	 */
	public static String genJavaBeanFromTableStructure(List<ColumnModel> columnModelList,String beanName){
		StringBuilder sb = new StringBuilder();
		sb.append("import java.util.Date;\r\n ");
		sb.append("\r\n ");
		sb.append("\r\n ");
		try {
			sb.append("public class "+toFirstCharUpCase(beanName)+" {\r\n\r\n\r\n\r\n");
			for (ColumnModel columnModel : columnModelList) {
				/*if(StringUtils.isNotBlank(columnModel.getRemarks())){
					sb.append("	//"+columnModel.getRemarks()+" \r\n");
				}*/
				sb.append("	private "+columnModel.getFieldType()+" "+columnModel.getFieldName()+";	// "+columnModel.getRemarks()+" \r\n");
			}
			sb.append("\r\n");
			//get set
			for (ColumnModel columnModel : columnModelList) {
				sb.append(
						"\tpublic "+columnModel.getFieldType()+" get"+toFirstCharUpCase((String) columnModel.getFieldName())+"() {\r\n" +
						"\t\treturn "+columnModel.getFieldName()+";\r\n" + 
						"\t}\r\n" + 
						"\r\n" + 
						"\tpublic void set"+toFirstCharUpCase((String) columnModel.getFieldName())+"("+columnModel.getFieldType()+" "+columnModel.getFieldName()+") {\r\n" + 
						"\t\t"+"this."+columnModel.getFieldName()+" = "+columnModel.getFieldName()+";\r\n" + 
						"\t}\r\n\r\n");
			}
			sb.append("}\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	/**
	 * 从表结构中去生成xml 映射
	 * @param structureList
	 * @param beanName
	 * * @param tableName 表名
	 * @return
	 */
	public static String cretedXml(List<ColumnModel> columnModelList,String beanName,String tableName){
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n ");
		sb.append("\r\n ");
		sb.append(" <class name="+beanName+" table="+tableName+">  \r\n ");
		try {
			for (ColumnModel columnModel : columnModelList) {
				if(columnModel.getFieldName().equals("id")){
					sb.append("\t\t  <id name="+columnModel.getFieldName()+" type="+columnModel.getColumnClassName()+" column="+columnModel.getColumnName()+">\r\n "); 
					sb.append(" \t\t\t  <generator class=identity> </generator>	\r\n ");          
					sb.append("\t\t </id>\r\n"); 
					continue;
				}
				sb.append(" \t\t <property name="+columnModel.getFieldName()+"\t column="+columnModel.getColumnName()+"\t type="+columnModel.getColumnClassName()+" />\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sb.append(" </class>  "); 
		return sb.toString();
	}
	
	/**
	 * 将首字母变大写
	 * @param str
	 * @return
	 */
	public static String toFirstCharUpCase(String str){
		char[]  columnCharArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < columnCharArr.length; i++) {
			  char cur = columnCharArr[i];
			  if(i==0){
				  sb.append(Character.toUpperCase(cur));
			  }else{
				  sb.append(cur);
			  }
		}
		return sb.toString();
	}


	

}
