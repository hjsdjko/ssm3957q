package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianluxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianluxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianluxinxiView;


/**
 * 线路信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface DiscussxianluxinxiService extends IService<DiscussxianluxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianluxinxiVO> selectListVO(Wrapper<DiscussxianluxinxiEntity> wrapper);
   	
   	DiscussxianluxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
   	
   	List<DiscussxianluxinxiView> selectListView(Wrapper<DiscussxianluxinxiEntity> wrapper);
   	
   	DiscussxianluxinxiView selectView(@Param("ew") Wrapper<DiscussxianluxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianluxinxiEntity> wrapper);
   	
}

