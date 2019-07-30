package com.hzz.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.hzz.ColumnModel;
import com.hzz.CreatedJavaClassBiz;

public class CreatedJavaClassUtil {
	
	
	/**
	 * 生成java类
	 * @param tableName 表名
	 * @param className 类名
	 * @throws Exception 
	 */
	public  static void createdJavaBean(String tableName,String className) {
		
		//获取数据库表接构
		List<ColumnModel> columnModelList = CreatedJavaClassBiz.getTableStructure(tableName);
		//解析表接构成java 类
		String text = CreatedJavaClassBiz.genJavaBeanFromTableStructure(columnModelList, className);
		//写入项目跟目录
		File file=new File("");
	    String absolutePath = file.getAbsolutePath()+"\\src\\main\\java\\"; //获取项目根目录
	    FileOutputStream fos=null;
	    try {
	    	fos=new FileOutputStream(absolutePath+className+".java");
	 	    fos.write(text.getBytes("UTF-8"));
	 	   
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	    FileOutputStream fosXml=null;
	    try {
	    	  //写入xml 映射
		    String strXml = CreatedJavaClassBiz.cretedXml(columnModelList, className, tableName);
		    fosXml=new FileOutputStream(absolutePath+className.toLowerCase()+".xml");
		    fosXml.write(strXml.getBytes("UTF-8"));
		    fosXml.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fosXml!=null){
				try {
					fosXml.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	  
	}

}
