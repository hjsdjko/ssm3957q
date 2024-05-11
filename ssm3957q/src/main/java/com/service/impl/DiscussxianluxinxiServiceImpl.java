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


import com.dao.DiscussxianluxinxiDao;
import com.entity.DiscussxianluxinxiEntity;
import com.service.DiscussxianluxinxiService;
import com.entity.vo.DiscussxianluxinxiVO;
import com.entity.view.DiscussxianluxinxiView;

@Service("discussxianluxinxiService")
public class DiscussxianluxinxiServiceImpl extends ServiceImpl<DiscussxianluxinxiDao, DiscussxianluxinxiEntity> implements DiscussxianluxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxianluxinxiEntity> page = this.selectPage(
                new Query<DiscussxianluxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxianluxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxianluxinxiEntity> wrapper) {
		  Page<DiscussxianluxinxiView> page =new Query<DiscussxianluxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxianluxinxiVO> selectListVO(Wrapper<DiscussxianluxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxianluxinxiVO selectVO(Wrapper<DiscussxianluxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxianluxinxiView> selectListView(Wrapper<DiscussxianluxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxianluxinxiView selectView(Wrapper<DiscussxianluxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
