package com.dao;

import com.entity.ChengpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengpinxinxiVO;
import com.entity.view.ChengpinxinxiView;


/**
 * 成品信息
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface ChengpinxinxiDao extends BaseMapper<ChengpinxinxiEntity> {
	
	List<ChengpinxinxiVO> selectListVO(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
	
	ChengpinxinxiVO selectVO(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
	
	List<ChengpinxinxiView> selectListView(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);

	List<ChengpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
	
	ChengpinxinxiView selectView(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
	

}
