package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhoubianfenleiDao;
import com.entity.ZhoubianfenleiEntity;
import com.service.ZhoubianfenleiService;
import com.entity.vo.ZhoubianfenleiVO;
import com.entity.view.ZhoubianfenleiView;

@Service("zhoubianfenleiService")
public class ZhoubianfenleiServiceImpl extends ServiceImpl<ZhoubianfenleiDao, ZhoubianfenleiEntity> implements ZhoubianfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianfenleiEntity> page = this.selectPage(
                new Query<ZhoubianfenleiEntity>(params).getPage(),
                new EntityWrapper<ZhoubianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianfenleiEntity> wrapper) {
		  Page<ZhoubianfenleiView> page =new Query<ZhoubianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianfenleiVO> selectListVO(Wrapper<ZhoubianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianfenleiVO selectVO(Wrapper<ZhoubianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianfenleiView> selectListView(Wrapper<ZhoubianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianfenleiView selectView(Wrapper<ZhoubianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
