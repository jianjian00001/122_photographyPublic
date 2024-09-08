package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 成品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
@TableName("chengpinxinxi")
public class ChengpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengpinxinxiEntity() {
		
	}
	
	public ChengpinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 成品名称
	 */
					
	private String chengpinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：成品名称
	 */
	public void setChengpinmingcheng(String chengpinmingcheng) {
		this.chengpinmingcheng = chengpinmingcheng;
	}
	/**
	 * 获取：成品名称
	 */
	public String getChengpinmingcheng() {
		return chengpinmingcheng;
	}
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
