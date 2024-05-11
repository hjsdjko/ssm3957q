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


import com.dao.ZhandianfenleiDao;
import com.entity.ZhandianfenleiEntity;
import com.service.ZhandianfenleiService;
import com.entity.vo.ZhandianfenleiVO;
import com.entity.view.ZhandianfenleiView;

@Service("zhandianfenleiService")
public class ZhandianfenleiServiceImpl extends ServiceImpl<ZhandianfenleiDao, ZhandianfenleiEntity> implements ZhandianfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhandianfenleiEntity> page = this.selectPage(
                new Query<ZhandianfenleiEntity>(params).getPage(),
                new EntityWrapper<ZhandianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhandianfenleiEntity> wrapper) {
		  Page<ZhandianfenleiView> page =new Query<ZhandianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhandianfenleiVO> selectListVO(Wrapper<ZhandianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhandianfenleiVO selectVO(Wrapper<ZhandianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhandianfenleiView> selectListView(Wrapper<ZhandianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhandianfenleiView selectView(Wrapper<ZhandianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
