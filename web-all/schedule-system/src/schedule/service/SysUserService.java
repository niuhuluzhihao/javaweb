package schedule.service;

import schedule.pojo.SysUser;

public interface SysUserService {
    int regist(SysUser sysUser);

    SysUser findByUsername(String username);
}
