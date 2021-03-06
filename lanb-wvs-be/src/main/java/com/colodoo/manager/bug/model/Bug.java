package com.colodoo.manager.bug.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Bug {
    /**
     * 漏洞ID
     */
    private String bugId;

    /**
     * 漏洞名
     */
    private String bugName;

    /**
     * 漏洞描述
     */
    private String desc;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateUserId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 漏洞ID
     * @return bug_id 漏洞ID
     */
    public String getBugId() {
        return bugId;
    }

    /**
     * 漏洞ID
     * @param bugId 漏洞ID
     */
    public void setBugId(String bugId) {
        this.bugId = bugId == null ? null : bugId.trim();
    }

    /**
     * 漏洞名
     * @return bug_name 漏洞名
     */
    public String getBugName() {
        return bugName;
    }

    /**
     * 漏洞名
     * @param bugName 漏洞名
     */
    public void setBugName(String bugName) {
        this.bugName = bugName == null ? null : bugName.trim();
    }

    /**
     * 漏洞描述
     * @return desc 漏洞描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 漏洞描述
     * @param desc 漏洞描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人
     * @return update_user_id 更新人
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新人
     * @param updateUserId 更新人
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}