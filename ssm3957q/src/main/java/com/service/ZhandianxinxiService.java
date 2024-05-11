package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhandianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhandianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhandianxinxiView;


/**
 * 站点信息
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhandianxinxiService extends IService<ZhandianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhandianxinxiVO> selectListVO(Wrapper<ZhandianxinxiEntity> wrapper);
   	
   	ZhandianxinxiVO selectVO(@Param("ew") Wrapper<ZhandianxinxiEntity> wrapper);
   	
   	List<ZhandianxinxiView> selectListView(Wrapper<ZhandianxinxiEntity> wrapper);
   	
   	ZhandianxinxiView selectView(@Param("ew") Wrapper<ZhandianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhandianxinxiEntity> wrapper);
   	
}

