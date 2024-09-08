package com.entity.model;

import com.entity.ChengpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 成品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public class ChengpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成品图片
	 */
	
	private String chengpintupian;
		
	/**
	 * 成品附件
	 */
	
	private String chengpinfujian;
		
	/**
	 * 个人账号
	 */
	
	private String gerenzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 上传日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 联系手机
	 */
	
	private String lianxishouji;
				
	
	/**
	 * 设置：成品图片
	 */
	 
	public void setChengpintupian(String chengpintupian) {
		this.chengpintupian = chengpintupian;
	}
	
	/**
	 * 获取：成品图片
	 */
	public String getChengpintupian() {
		return chengpintupian;
	}
				
	
	/**
	 * 设置：成品附件
	 */
	 
	public void setChengpinfujian(String chengpinfujian) {
		this.chengpinfujian = chengpinfujian;
	}
	
	/**
	 * 获取：成品附件
	 */
	public String getChengpinfujian() {
		return chengpinfujian;
	}
				
	
	/**
	 * 设置：个人账号
	 */
	 
	public void setGerenzhanghao(String gerenzhanghao) {
		this.gerenzhanghao = gerenzhanghao;
	}
	
	/**
	 * 获取：个人账号
	 */
	public String getGerenzhanghao() {
		return gerenzhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：上传日期
	 */
	 
	public void setShangchuanriqi(Date shangchuanriqi) {
		this.shangchuanriqi = shangchuanriqi;
	}
	
	/**
	 * 获取：上传日期
	 */
	public Date getShangchuanriqi() {
		return shangchuanriqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：联系手机
	 */
	 
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
			
}
