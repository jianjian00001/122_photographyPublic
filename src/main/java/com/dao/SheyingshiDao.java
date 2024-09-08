package com.dao;

import com.entity.SheyingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingshiVO;
import com.entity.view.SheyingshiView;


/**
 * 摄影师
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface SheyingshiDao extends BaseMapper<SheyingshiEntity> {
	
	List<SheyingshiVO> selectListVO(@Param("ew") Wrapper<SheyingshiEntity> wrapper);
	
	SheyingshiVO selectVO(@Param("ew") Wrapper<SheyingshiEntity> wrapper);
	
	List<SheyingshiView> selectListView(@Param("ew") Wrapper<SheyingshiEntity> wrapper);

	List<SheyingshiView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingshiEntity> wrapper);
	
	SheyingshiView selectView(@Param("ew") Wrapper<SheyingshiEntity> wrapper);
	

}
