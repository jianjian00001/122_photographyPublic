package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengpinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengpinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengpinxinxiView;


/**
 * 成品信息
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface ChengpinxinxiService extends IService<ChengpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengpinxinxiVO> selectListVO(Wrapper<ChengpinxinxiEntity> wrapper);
   	
   	ChengpinxinxiVO selectVO(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
   	
   	List<ChengpinxinxiView> selectListView(Wrapper<ChengpinxinxiEntity> wrapper);
   	
   	ChengpinxinxiView selectView(@Param("ew") Wrapper<ChengpinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengpinxinxiEntity> wrapper);
   	

}

