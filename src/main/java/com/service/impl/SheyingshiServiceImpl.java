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


import com.dao.SheyingshiDao;
import com.entity.SheyingshiEntity;
import com.service.SheyingshiService;
import com.entity.vo.SheyingshiVO;
import com.entity.view.SheyingshiView;

@Service("sheyingshiService")
public class SheyingshiServiceImpl extends ServiceImpl<SheyingshiDao, SheyingshiEntity> implements SheyingshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingshiEntity> page = this.selectPage(
                new Query<SheyingshiEntity>(params).getPage(),
                new EntityWrapper<SheyingshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingshiEntity> wrapper) {
		  Page<SheyingshiView> page =new Query<SheyingshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingshiVO> selectListVO(Wrapper<SheyingshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingshiVO selectVO(Wrapper<SheyingshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingshiView> selectListView(Wrapper<SheyingshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingshiView selectView(Wrapper<SheyingshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
