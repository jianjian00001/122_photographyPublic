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


import com.dao.ChengpinxinxiDao;
import com.entity.ChengpinxinxiEntity;
import com.service.ChengpinxinxiService;
import com.entity.vo.ChengpinxinxiVO;
import com.entity.view.ChengpinxinxiView;

@Service("chengpinxinxiService")
public class ChengpinxinxiServiceImpl extends ServiceImpl<ChengpinxinxiDao, ChengpinxinxiEntity> implements ChengpinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengpinxinxiEntity> page = this.selectPage(
                new Query<ChengpinxinxiEntity>(params).getPage(),
                new EntityWrapper<ChengpinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengpinxinxiEntity> wrapper) {
		  Page<ChengpinxinxiView> page =new Query<ChengpinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengpinxinxiVO> selectListVO(Wrapper<ChengpinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengpinxinxiVO selectVO(Wrapper<ChengpinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengpinxinxiView> selectListView(Wrapper<ChengpinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengpinxinxiView selectView(Wrapper<ChengpinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
