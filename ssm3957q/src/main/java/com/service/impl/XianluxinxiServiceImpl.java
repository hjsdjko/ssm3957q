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


import com.dao.XianluxinxiDao;
import com.entity.XianluxinxiEntity;
import com.service.XianluxinxiService;
import com.entity.vo.XianluxinxiVO;
import com.entity.view.XianluxinxiView;

@Service("xianluxinxiService")
public class XianluxinxiServiceImpl extends ServiceImpl<XianluxinxiDao, XianluxinxiEntity> implements XianluxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianluxinxiEntity> page = this.selectPage(
                new Query<XianluxinxiEntity>(params).getPage(),
                new EntityWrapper<XianluxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianluxinxiEntity> wrapper) {
		  Page<XianluxinxiView> page =new Query<XianluxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianluxinxiVO> selectListVO(Wrapper<XianluxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianluxinxiVO selectVO(Wrapper<XianluxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianluxinxiView> selectListView(Wrapper<XianluxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianluxinxiView selectView(Wrapper<XianluxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
