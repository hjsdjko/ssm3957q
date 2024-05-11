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


import com.dao.ZhoubianxinxiDao;
import com.entity.ZhoubianxinxiEntity;
import com.service.ZhoubianxinxiService;
import com.entity.vo.ZhoubianxinxiVO;
import com.entity.view.ZhoubianxinxiView;

@Service("zhoubianxinxiService")
public class ZhoubianxinxiServiceImpl extends ServiceImpl<ZhoubianxinxiDao, ZhoubianxinxiEntity> implements ZhoubianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianxinxiEntity> page = this.selectPage(
                new Query<ZhoubianxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhoubianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianxinxiEntity> wrapper) {
		  Page<ZhoubianxinxiView> page =new Query<ZhoubianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianxinxiVO> selectListVO(Wrapper<ZhoubianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianxinxiVO selectVO(Wrapper<ZhoubianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianxinxiView> selectListView(Wrapper<ZhoubianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianxinxiView selectView(Wrapper<ZhoubianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
