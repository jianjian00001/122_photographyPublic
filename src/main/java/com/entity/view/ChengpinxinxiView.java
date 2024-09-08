package com.entity.view;

import com.entity.ChengpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成品信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
@TableName("chengpinxinxi")
public class ChengpinxinxiView  extends ChengpinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengpinxinxiView(){
	}
 
 	public ChengpinxinxiView(ChengpinxinxiEntity chengpinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chengpinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
