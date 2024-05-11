package com.entity.model;

import com.entity.XianluxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 线路信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public class XianluxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 线路起点
	 */
	
	private String xianluqidian;
		
	/**
	 * 线路终点
	 */
	
	private String xianluzhongdian;
		
	/**
	 * 线路途经
	 */
	
	private String xianlutujing;
		
	/**
	 * 班次推荐
	 */
	
	private String bancituijian;
		
	/**
	 * 班次时间
	 */
	
	private String bancishijian;
		
	/**
	 * 所需时间
	 */
	
	private String suoxushijian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 线路介绍
	 */
	
	private String xianlujieshao;
				
	
	/**
	 * 设置：线路起点
	 */
	 
	public void setXianluqidian(String xianluqidian) {
		this.xianluqidian = xianluqidian;
	}
	
	/**
	 * 获取：线路起点
	 */
	public String getXianluqidian() {
		return xianluqidian;
	}
				
	
	/**
	 * 设置：线路终点
	 */
	 
	public void setXianluzhongdian(String xianluzhongdian) {
		this.xianluzhongdian = xianluzhongdian;
	}
	
	/**
	 * 获取：线路终点
	 */
	public String getXianluzhongdian() {
		return xianluzhongdian;
	}
				
	
	/**
	 * 设置：线路途经
	 */
	 
	public void setXianlutujing(String xianlutujing) {
		this.xianlutujing = xianlutujing;
	}
	
	/**
	 * 获取：线路途经
	 */
	public String getXianlutujing() {
		return xianlutujing;
	}
				
	
	/**
	 * 设置：班次推荐
	 */
	 
	public void setBancituijian(String bancituijian) {
		this.bancituijian = bancituijian;
	}
	
	/**
	 * 获取：班次推荐
	 */
	public String getBancituijian() {
		return bancituijian;
	}
				
	
	/**
	 * 设置：班次时间
	 */
	 
	public void setBancishijian(String bancishijian) {
		this.bancishijian = bancishijian;
	}
	
	/**
	 * 获取：班次时间
	 */
	public String getBancishijian() {
		return bancishijian;
	}
				
	
	/**
	 * 设置：所需时间
	 */
	 
	public void setSuoxushijian(String suoxushijian) {
		this.suoxushijian = suoxushijian;
	}
	
	/**
	 * 获取：所需时间
	 */
	public String getSuoxushijian() {
		return suoxushijian;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：线路介绍
	 */
	 
	public void setXianlujieshao(String xianlujieshao) {
		this.xianlujieshao = xianlujieshao;
	}
	
	/**
	 * 获取：线路介绍
	 */
	public String getXianlujieshao() {
		return xianlujieshao;
	}
			
}
