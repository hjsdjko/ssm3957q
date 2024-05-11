package com.dao;

import com.entity.ZhoubianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianxinxiVO;
import com.entity.view.ZhoubianxinxiView;


/**
 * 周边信息
 * 
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhoubianxinxiDao extends BaseMapper<ZhoubianxinxiEntity> {
	
	List<ZhoubianxinxiVO> selectListVO(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
	
	ZhoubianxinxiVO selectVO(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
	
	List<ZhoubianxinxiView> selectListView(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);

	List<ZhoubianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
	
	ZhoubianxinxiView selectView(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
	
}
