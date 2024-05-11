package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 线路信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
@TableName("xianluxinxi")
public class XianluxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XianluxinxiEntity() {
		
	}
	
	public XianluxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 线路名称
	 */
					
	private String xianlumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：线路名称
	 */
	public void setXianlumingcheng(String xianlumingcheng) {
		this.xianlumingcheng = xianlumingcheng;
	}
	/**
	 * 获取：线路名称
	 */
	public String getXianlumingcheng() {
		return xianlumingcheng;
	}
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
