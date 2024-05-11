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
 * 站点信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
@TableName("zhandianxinxi")
public class ZhandianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhandianxinxiEntity() {
		
	}
	
	public ZhandianxinxiEntity(T t) {
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
	 * 站点名称
	 */
					
	private String zhandianmingcheng;
	
	/**
	 * 站点分类
	 */
					
	private String zhandianfenlei;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 发车间隔
	 */
					
	private String fachejiange;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：站点名称
	 */
	public void setZhandianmingcheng(String zhandianmingcheng) {
		this.zhandianmingcheng = zhandianmingcheng;
	}
	/**
	 * 获取：站点名称
	 */
	public String getZhandianmingcheng() {
		return zhandianmingcheng;
	}
	/**
	 * 设置：站点分类
	 */
	public void setZhandianfenlei(String zhandianfenlei) {
		this.zhandianfenlei = zhandianfenlei;
	}
	/**
	 * 获取：站点分类
	 */
	public String getZhandianfenlei() {
		return zhandianfenlei;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：发车间隔
	 */
	public void setFachejiange(String fachejiange) {
		this.fachejiange = fachejiange;
	}
	/**
	 * 获取：发车间隔
	 */
	public String getFachejiange() {
		return fachejiange;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
