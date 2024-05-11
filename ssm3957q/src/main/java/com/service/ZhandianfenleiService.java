package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhandianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhandianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhandianfenleiView;


/**
 * 站点分类
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhandianfenleiService extends IService<ZhandianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhandianfenleiVO> selectListVO(Wrapper<ZhandianfenleiEntity> wrapper);
   	
   	ZhandianfenleiVO selectVO(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
   	
   	List<ZhandianfenleiView> selectListView(Wrapper<ZhandianfenleiEntity> wrapper);
   	
   	ZhandianfenleiView selectView(@Param("ew") Wrapper<ZhandianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhandianfenleiEntity> wrapper);
   	
}

