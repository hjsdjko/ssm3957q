package com.entity.view;

import com.entity.ZhoubianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
@TableName("zhoubianxinxi")
public class ZhoubianxinxiView  extends ZhoubianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhoubianxinxiView(){
	}
 
 	public ZhoubianxinxiView(ZhoubianxinxiEntity zhoubianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhoubianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
