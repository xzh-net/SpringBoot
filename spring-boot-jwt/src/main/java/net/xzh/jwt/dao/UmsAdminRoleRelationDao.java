package net.xzh.jwt.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.xzh.jwt.model.UmsPermission;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
