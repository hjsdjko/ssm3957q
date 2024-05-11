package com.dao;

import com.entity.ZhoubianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianfenleiVO;
import com.entity.view.ZhoubianfenleiView;


/**
 * 周边分类
 * 
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhoubianfenleiDao extends BaseMapper<ZhoubianfenleiEntity> {
	
	List<ZhoubianfenleiVO> selectListVO(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	ZhoubianfenleiVO selectVO(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	List<ZhoubianfenleiView> selectListView(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);

	List<ZhoubianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	ZhoubianfenleiView selectView(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
}
