package com.dao;

import com.entity.DiscussxianluxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianluxinxiVO;
import com.entity.view.DiscussxianluxinxiView;


/**
 * 线路信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface DiscussxianluxinxiDao extends BaseMapper<DiscussxianluxinxiEntity> {
	
	List<DiscussxianluxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
	
	DiscussxianluxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
	
	List<DiscussxianluxinxiView> selectListView(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);

	List<DiscussxianluxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
	
	DiscussxianluxinxiView selectView(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
	
}
