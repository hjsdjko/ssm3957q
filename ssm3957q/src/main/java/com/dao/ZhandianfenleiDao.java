package com.dao;

import com.entity.ZhandianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhandianfenleiVO;
import com.entity.view.ZhandianfenleiView;


/**
 * 站点分类
 * 
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhandianfenleiDao extends BaseMapper<ZhandianfenleiEntity> {
	
	List<ZhandianfenleiVO> selectListVO(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
	
	ZhandianfenleiVO selectVO(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
	
	List<ZhandianfenleiView> selectListView(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);

	List<ZhandianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
	
	ZhandianfenleiView selectView(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
	
}
