package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianluxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianluxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianluxinxiView;


/**
 * 线路信息
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface XianluxinxiService extends IService<XianluxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianluxinxiVO> selectListVO(Wrapper<XianluxinxiEntity> wrapper);
   	
   	XianluxinxiVO selectVO(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
   	
   	List<XianluxinxiView> selectListView(Wrapper<XianluxinxiEntity> wrapper);
   	
   	XianluxinxiView selectView(@Param("ew") Wrapper<XianluxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianluxinxiEntity> wrapper);
   	
}

