package com.entity.view;

import com.entity.DiscussxianluxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线路信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
@TableName("discussxianluxinxi")
public class DiscussxianluxinxiView  extends DiscussxianluxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxianluxinxiView(){
	}
 
 	public DiscussxianluxinxiView(DiscussxianluxinxiEntity discussxianluxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxianluxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
