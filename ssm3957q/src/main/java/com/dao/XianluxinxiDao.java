package com.dao;

import com.entity.XianluxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianluxinxiVO;
import com.entity.view.XianluxinxiView;


/**
 * 线路信息
 * 
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface XianluxinxiDao extends BaseMapper<XianluxinxiEntity> {
	
	List<XianluxinxiVO> selectListVO(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
	
	XianluxinxiVO selectVO(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
	
	List<XianluxinxiView> selectListView(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);

	List<XianluxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
	
	XianluxinxiView selectView(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
	
}
