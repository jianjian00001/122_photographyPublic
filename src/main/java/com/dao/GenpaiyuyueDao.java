package com.dao;

import com.entity.GenpaiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GenpaiyuyueVO;
import com.entity.view.GenpaiyuyueView;


/**
 * 跟拍预约
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface GenpaiyuyueDao extends BaseMapper<GenpaiyuyueEntity> {
	
	List<GenpaiyuyueVO> selectListVO(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
	
	GenpaiyuyueVO selectVO(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
	
	List<GenpaiyuyueView> selectListView(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);

	List<GenpaiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
	
	GenpaiyuyueView selectView(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
	

}
