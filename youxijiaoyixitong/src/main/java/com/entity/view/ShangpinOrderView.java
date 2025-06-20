package com.entity.view;

import com.entity.ShangpinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_order")
public class ShangpinOrderView extends ShangpinOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String shangpinOrderValue;
		/**
		* 支付类型的值
		*/
		private String shangpinOrderPaymentValue;



		//级联表 shangpin
			/**
			* 商品名称
			*/
			private String shangpinName;
			/**
			* 商品编号
			*/
			private String shangpinUuidNumber;
			/**
			* 商品照片
			*/
			private String shangpinPhoto;
			/**
			* 游戏类型
			*/
			private Integer shangpinTypes;
				/**
				* 游戏类型的值
				*/
				private String shangpinValue;
			/**
			* 游戏玩法
			*/
			private Integer youxiwanfaTypes;
				/**
				* 游戏玩法的值
				*/
				private String youxiwanfaValue;
			/**
			* 交易类型
			*/
			private Integer jiaoyileixingTypes;
				/**
				* 交易类型的值
				*/
				private String jiaoyileixingValue;
			/**
			* 操作方式
			*/
			private Integer caozuofangshiTypes;
				/**
				* 操作方式的值
				*/
				private String caozuofangshiValue;
			/**
			* 是否热门
			*/
			private Integer remenTypes;
				/**
				* 是否热门的值
				*/
				private String remenValue;
			/**
			* 商品库存
			*/
			private Integer shangpinKucunNumber;
			/**
			* 购买获得积分
			*/
			private Integer shangpinPrice;
			/**
			* 商品原价
			*/
			private Double shangpinOldMoney;
			/**
			* 现价/积分
			*/
			private Double shangpinNewMoney;
			/**
			* 商品热度
			*/
			private Integer shangpinClicknum;
			/**
			* 商品介绍
			*/
			private String shangpinContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shangpinDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 现积分
			*/
			private Double yonghuNewJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;
			/**
			* 用户状态
			*/
			private Integer yonghuTypes;
				/**
				* 用户状态的值
				*/
				private String yonghuValue;

	public ShangpinOrderView() {

	}

	public ShangpinOrderView(ShangpinOrderEntity shangpinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getShangpinOrderValue() {
				return shangpinOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setShangpinOrderValue(String shangpinOrderValue) {
				this.shangpinOrderValue = shangpinOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getShangpinOrderPaymentValue() {
				return shangpinOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setShangpinOrderPaymentValue(String shangpinOrderPaymentValue) {
				this.shangpinOrderPaymentValue = shangpinOrderPaymentValue;
			}













				//级联表的get和set shangpin

					/**
					* 获取： 商品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}

					/**
					* 获取： 商品编号
					*/
					public String getShangpinUuidNumber() {
						return shangpinUuidNumber;
					}
					/**
					* 设置： 商品编号
					*/
					public void setShangpinUuidNumber(String shangpinUuidNumber) {
						this.shangpinUuidNumber = shangpinUuidNumber;
					}

					/**
					* 获取： 商品照片
					*/
					public String getShangpinPhoto() {
						return shangpinPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setShangpinPhoto(String shangpinPhoto) {
						this.shangpinPhoto = shangpinPhoto;
					}

					/**
					* 获取： 游戏类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 游戏类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 游戏类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 游戏类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}

					/**
					* 获取： 游戏玩法
					*/
					public Integer getYouxiwanfaTypes() {
						return youxiwanfaTypes;
					}
					/**
					* 设置： 游戏玩法
					*/
					public void setYouxiwanfaTypes(Integer youxiwanfaTypes) {
						this.youxiwanfaTypes = youxiwanfaTypes;
					}


						/**
						* 获取： 游戏玩法的值
						*/
						public String getYouxiwanfaValue() {
							return youxiwanfaValue;
						}
						/**
						* 设置： 游戏玩法的值
						*/
						public void setYouxiwanfaValue(String youxiwanfaValue) {
							this.youxiwanfaValue = youxiwanfaValue;
						}

					/**
					* 获取： 交易类型
					*/
					public Integer getJiaoyileixingTypes() {
						return jiaoyileixingTypes;
					}
					/**
					* 设置： 交易类型
					*/
					public void setJiaoyileixingTypes(Integer jiaoyileixingTypes) {
						this.jiaoyileixingTypes = jiaoyileixingTypes;
					}


						/**
						* 获取： 交易类型的值
						*/
						public String getJiaoyileixingValue() {
							return jiaoyileixingValue;
						}
						/**
						* 设置： 交易类型的值
						*/
						public void setJiaoyileixingValue(String jiaoyileixingValue) {
							this.jiaoyileixingValue = jiaoyileixingValue;
						}

					/**
					* 获取： 操作方式
					*/
					public Integer getCaozuofangshiTypes() {
						return caozuofangshiTypes;
					}
					/**
					* 设置： 操作方式
					*/
					public void setCaozuofangshiTypes(Integer caozuofangshiTypes) {
						this.caozuofangshiTypes = caozuofangshiTypes;
					}


						/**
						* 获取： 操作方式的值
						*/
						public String getCaozuofangshiValue() {
							return caozuofangshiValue;
						}
						/**
						* 设置： 操作方式的值
						*/
						public void setCaozuofangshiValue(String caozuofangshiValue) {
							this.caozuofangshiValue = caozuofangshiValue;
						}

					/**
					* 获取： 是否热门
					*/
					public Integer getRemenTypes() {
						return remenTypes;
					}
					/**
					* 设置： 是否热门
					*/
					public void setRemenTypes(Integer remenTypes) {
						this.remenTypes = remenTypes;
					}


						/**
						* 获取： 是否热门的值
						*/
						public String getRemenValue() {
							return remenValue;
						}
						/**
						* 设置： 是否热门的值
						*/
						public void setRemenValue(String remenValue) {
							this.remenValue = remenValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getShangpinKucunNumber() {
						return shangpinKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
						this.shangpinKucunNumber = shangpinKucunNumber;
					}

					/**
					* 获取： 购买获得积分
					*/
					public Integer getShangpinPrice() {
						return shangpinPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setShangpinPrice(Integer shangpinPrice) {
						this.shangpinPrice = shangpinPrice;
					}

					/**
					* 获取： 商品原价
					*/
					public Double getShangpinOldMoney() {
						return shangpinOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setShangpinOldMoney(Double shangpinOldMoney) {
						this.shangpinOldMoney = shangpinOldMoney;
					}

					/**
					* 获取： 现价/积分
					*/
					public Double getShangpinNewMoney() {
						return shangpinNewMoney;
					}
					/**
					* 设置： 现价/积分
					*/
					public void setShangpinNewMoney(Double shangpinNewMoney) {
						this.shangpinNewMoney = shangpinNewMoney;
					}

					/**
					* 获取： 商品热度
					*/
					public Integer getShangpinClicknum() {
						return shangpinClicknum;
					}
					/**
					* 设置： 商品热度
					*/
					public void setShangpinClicknum(Integer shangpinClicknum) {
						this.shangpinClicknum = shangpinClicknum;
					}

					/**
					* 获取： 商品介绍
					*/
					public String getShangpinContent() {
						return shangpinContent;
					}
					/**
					* 设置： 商品介绍
					*/
					public void setShangpinContent(String shangpinContent) {
						this.shangpinContent = shangpinContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShangpinDelete() {
						return shangpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShangpinDelete(Integer shangpinDelete) {
						this.shangpinDelete = shangpinDelete;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}

					/**
					* 获取： 现积分
					*/
					public Double getYonghuNewJifen() {
						return yonghuNewJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuNewJifen(Double yonghuNewJifen) {
						this.yonghuNewJifen = yonghuNewJifen;
					}

					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}

					/**
					* 获取： 用户状态
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 用户状态
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 用户状态的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 用户状态的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}



}
