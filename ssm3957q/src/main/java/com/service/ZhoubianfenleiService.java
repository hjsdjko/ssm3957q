package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianfenleiView;


/**
 * 周边分类
 *
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public interface ZhoubianfenleiService extends IService<ZhoubianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianfenleiVO> selectListVO(Wrapper<ZhoubianfenleiEntity> wrapper);
   	
   	ZhoubianfenleiVO selectVO(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
   	
   	List<ZhoubianfenleiView> selectListView(Wrapper<ZhoubianfenleiEntity> wrapper);
   	
   	ZhoubianfenleiView selectView(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianfenleiEntity> wrapper);
   	
}

