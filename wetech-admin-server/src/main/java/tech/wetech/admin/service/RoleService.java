package tech.wetech.admin.service;

import tech.wetech.admin.model.dto.RoleDTO;
import tech.wetech.admin.service.IService;
import tech.wetech.admin.model.entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService extends IService<Role> {

    /**
     * 根据角色编号得到角色标识符列表
     * @param roleIds
     * @return
     */
    Set<String> queryRoles(Long... roleIds);

    /**
     * 根据角色编号得到权限字符串列表
     * @param roleIds
     * @return
     */
    Set<String> queryPermissions(Long[] roleIds);

    List<RoleDTO> queryAllRole();
}