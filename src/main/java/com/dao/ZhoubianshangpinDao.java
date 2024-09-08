package com.dao;

import com.entity.ZhoubianshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianshangpinVO;
import com.entity.view.ZhoubianshangpinView;


/**
 * 周边商品
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface ZhoubianshangpinDao extends BaseMapper<ZhoubianshangpinEntity> {
	
	List<ZhoubianshangpinVO> selectListVO(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
	
	ZhoubianshangpinVO selectVO(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
	
	List<ZhoubianshangpinView> selectListView(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);

	List<ZhoubianshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
	
	ZhoubianshangpinView selectView(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
	

}
