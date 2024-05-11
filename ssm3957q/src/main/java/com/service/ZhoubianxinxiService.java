package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianxinxiView;


/**
 * 周边信息
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhoubianxinxiService extends IService<ZhoubianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianxinxiVO> selectListVO(Wrapper<ZhoubianxinxiEntity> wrapper);
   	
   	ZhoubianxinxiVO selectVO(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
   	
   	List<ZhoubianxinxiView> selectListView(Wrapper<ZhoubianxinxiEntity> wrapper);
   	
   	ZhoubianxinxiView selectView(@Param("ew") Wrapper<ZhoubianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianxinxiEntity> wrapper);
   	
}

