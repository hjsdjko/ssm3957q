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


import com.dao.ZhandianxinxiDao;
import com.entity.ZhandianxinxiEntity;
import com.service.ZhandianxinxiService;
import com.entity.vo.ZhandianxinxiVO;
import com.entity.view.ZhandianxinxiView;

@Service("zhandianxinxiService")
public class ZhandianxinxiServiceImpl extends ServiceImpl<ZhandianxinxiDao, ZhandianxinxiEntity> implements ZhandianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhandianxinxiEntity> page = this.selectPage(
                new Query<ZhandianxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhandianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhandianxinxiEntity> wrapper) {
		  Page<ZhandianxinxiView> page =new Query<ZhandianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhandianxinxiVO> selectListVO(Wrapper<ZhandianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhandianxinxiVO selectVO(Wrapper<ZhandianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhandianxinxiView> selectListView(Wrapper<ZhandianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhandianxinxiView selectView(Wrapper<ZhandianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
