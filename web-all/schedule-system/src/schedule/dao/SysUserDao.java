package schedule.dao;

import schedule.pojo.SysUser;

// 用于定义针对表格的增删改查方法
public interface SysUserDao  {

    int addSysUser(SysUser sysUser);

    SysUser findByUsername(String username);
}
