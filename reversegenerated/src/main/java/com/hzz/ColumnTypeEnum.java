package com.hzz;



/**
 * 数据库类型
 * @author 
 *
 */
public enum ColumnTypeEnum {
	 VARCHAR("VARCHAR","java.lang.String"),
	 TEXT("TEXT","java.lang.String"),
	 INT("INT","java.lang.Integer"),
	 DATE("DATE","java.util.Date"),
	 DATETIME("DATETIME","java.util.Date"),
	 CHAR("CHAR","java.lang.String"),
	 DECIMAL("DECIMAL","java.lang.Double"),
	 DOUBLE("DOUBLE","java.lang.Double"),
	 Long("BIGINT","java.lang.Long");
	
     private String dbType;
     private String javaType;
     
     ColumnTypeEnum(String dbType,String javaType){
    	 this.dbType = dbType;
    	 this.javaType = javaType;
     }
     
     public static String getColumnTypeEnumByDBType(String dbType){
         for(ColumnTypeEnum columnTypeEnum:ColumnTypeEnum.values()){
             if(columnTypeEnum.getDbType().equals(dbType)){
                 return columnTypeEnum.getJavaType();
             }
         }
		return "";
     }

	public String getDbType() {
		return dbType;
	}


	public String getJavaType() {
		return javaType;
	}

}
