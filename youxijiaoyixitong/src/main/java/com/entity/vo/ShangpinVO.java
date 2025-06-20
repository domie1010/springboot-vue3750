package com.entity.vo;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangpin")
public class ShangpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商品名称
     */

    @TableField(value = "shangpin_name")
    private String shangpinName;


    /**
     * 商品编号
     */

    @TableField(value = "shangpin_uuid_number")
    private String shangpinUuidNumber;


    /**
     * 商品照片
     */

    @TableField(value = "shangpin_photo")
    private String shangpinPhoto;


    /**
     * 游戏类型
     */

    @TableField(value = "shangpin_types")
    private Integer shangpinTypes;


    /**
     * 游戏玩法
     */

    @TableField(value = "youxiwanfa_types")
    private Integer youxiwanfaTypes;


    /**
     * 交易类型
     */

    @TableField(value = "jiaoyileixing_types")
    private Integer jiaoyileixingTypes;


    /**
     * 操作方式
     */

    @TableField(value = "caozuofangshi_types")
    private Integer caozuofangshiTypes;


    /**
     * 是否热门
     */

    @TableField(value = "remen_types")
    private Integer remenTypes;


    /**
     * 商品库存
     */

    @TableField(value = "shangpin_kucun_number")
    private Integer shangpinKucunNumber;


    /**
     * 购买获得积分
     */

    @TableField(value = "shangpin_price")
    private Integer shangpinPrice;


    /**
     * 商品原价
     */

    @TableField(value = "shangpin_old_money")
    private Double shangpinOldMoney;


    /**
     * 现价/积分
     */

    @TableField(value = "shangpin_new_money")
    private Double shangpinNewMoney;


    /**
     * 商品热度
     */

    @TableField(value = "shangpin_clicknum")
    private Integer shangpinClicknum;


    /**
     * 商品介绍
     */

    @TableField(value = "shangpin_content")
    private String shangpinContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shangpin_delete")
    private Integer shangpinDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 设置：商品编号
	 */
    public String getShangpinUuidNumber() {
        return shangpinUuidNumber;
    }


    /**
	 * 获取：商品编号
	 */

    public void setShangpinUuidNumber(String shangpinUuidNumber) {
        this.shangpinUuidNumber = shangpinUuidNumber;
    }
    /**
	 * 设置：商品照片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 设置：游戏类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 获取：游戏类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 设置：游戏玩法
	 */
    public Integer getYouxiwanfaTypes() {
        return youxiwanfaTypes;
    }


    /**
	 * 获取：游戏玩法
	 */

    public void setYouxiwanfaTypes(Integer youxiwanfaTypes) {
        this.youxiwanfaTypes = youxiwanfaTypes;
    }
    /**
	 * 设置：交易类型
	 */
    public Integer getJiaoyileixingTypes() {
        return jiaoyileixingTypes;
    }


    /**
	 * 获取：交易类型
	 */

    public void setJiaoyileixingTypes(Integer jiaoyileixingTypes) {
        this.jiaoyileixingTypes = jiaoyileixingTypes;
    }
    /**
	 * 设置：操作方式
	 */
    public Integer getCaozuofangshiTypes() {
        return caozuofangshiTypes;
    }


    /**
	 * 获取：操作方式
	 */

    public void setCaozuofangshiTypes(Integer caozuofangshiTypes) {
        this.caozuofangshiTypes = caozuofangshiTypes;
    }
    /**
	 * 设置：是否热门
	 */
    public Integer getRemenTypes() {
        return remenTypes;
    }


    /**
	 * 获取：是否热门
	 */

    public void setRemenTypes(Integer remenTypes) {
        this.remenTypes = remenTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getShangpinKucunNumber() {
        return shangpinKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
        this.shangpinKucunNumber = shangpinKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getShangpinPrice() {
        return shangpinPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setShangpinPrice(Integer shangpinPrice) {
        this.shangpinPrice = shangpinPrice;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getShangpinOldMoney() {
        return shangpinOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setShangpinOldMoney(Double shangpinOldMoney) {
        this.shangpinOldMoney = shangpinOldMoney;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getShangpinNewMoney() {
        return shangpinNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setShangpinNewMoney(Double shangpinNewMoney) {
        this.shangpinNewMoney = shangpinNewMoney;
    }
    /**
	 * 设置：商品热度
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }


    /**
	 * 获取：商品热度
	 */

    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 设置：商品介绍
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 获取：商品介绍
	 */

    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShangpinDelete() {
        return shangpinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShangpinDelete(Integer shangpinDelete) {
        this.shangpinDelete = shangpinDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
