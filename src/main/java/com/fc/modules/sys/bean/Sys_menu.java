package com.fc.modules.sys.bean;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.EL;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.fc.common.service.core.BasePojo;

/**
 * Created by Wizzer.cn on 2015/7/1.
 */
@Table("sys_menu")
@TableIndexes({@Index(name = "INDEX_SYS_MENU_PATH", fields = {"path"}, unique = true)})
public class Sys_menu extends BasePojo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column
    @Name
    @Comment("ID")
    @ColDefine(type = ColType.VARCHAR, width = 64)
    @Prev(els = {@EL("uuid()")})
    private String id;
    @Column
    @Comment("父级ID")
    @ColDefine(type = ColType.VARCHAR, width = 64)
    private String parentId;
    @Column
    @Comment("树路径")
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String path;
    @Column
    @Comment("菜单名称")
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String name;
    @Column("alias_name")
    @Comment("菜单别名")
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String aliasName;
    @Column
    @Comment("资源类型")
    @ColDefine(type = ColType.VARCHAR, width = 10)
    private String type;
    @Column
    @Comment("菜单链接")
    @ColDefine(type = ColType.VARCHAR, width = 1000)
    private String href;
    @Column
    @Comment("打开方式")
    @ColDefine(type = ColType.VARCHAR, width = 50)
    private String target;
    @Column
    @Comment("菜单图标")
    @ColDefine(type = ColType.VARCHAR, width = 50)
    private String icon;
    @Column("is_show")
    @Comment("是否显示")
    private boolean show;
    @Column("is_enabled")
    @Comment("是否启用")
    private boolean enabled;
    @Column
    @Comment("权限标识")
    @ColDefine(type = ColType.VARCHAR, width = 500)
    private String permission;
    @Column
    @Comment("菜单介绍")
    @ColDefine(type = ColType.VARCHAR, width = 255)
    private String description;
    @Column
    @Comment("排序字段")
    private long location;
    @Column("has_children")
    @Comment("有子节点")
    private boolean hasChildren;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
