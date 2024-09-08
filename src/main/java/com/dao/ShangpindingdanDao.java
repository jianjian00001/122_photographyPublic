package com.dao;

import com.entity.ShangpindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpindingdanVO;
import com.entity.view.ShangpindingdanView;


/**
 * 商品订单
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:25
 */
public interface ShangpindingdanDao extends BaseMapper<ShangpindingdanEntity> {
	
	List<ShangpindingdanVO> selectListVO(@Param("ew") Wrapper<ShangpindingdanEntity> wrapper);
	
	ShangpindingdanVO selectVO(@Param("ew") Wrapper<ShangpindingdanEntity> wrapper);
	
	List<ShangpindingdanView> selectListView(@Param("ew") Wrapper<ShangpindingdanEntity> wrapper);

	List<ShangpindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpindingdanEntity> wrapper);
	
	ShangpindingdanView selectView(@Param("ew") Wrapper<ShangpindingdanEntity> wrapper);
	

}
