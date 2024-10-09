package schedule.service.impl;

import schedule.dao.SysUserDao;
import schedule.dao.impl.SysUserDaoImpl;
import schedule.pojo.SysUser;
import schedule.service.SysUserService;
import schedule.utils.MD5Util;

public class SysUserServiceImpl implements SysUserService {
    private SysUserDao sysUserDao = new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {
        // 将用户的明文密码转为密文
        String userPwd = sysUser.getUserPwd();
        String encrypt = MD5Util.encrypt(userPwd);
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用dao层的方法，将sysuser信息存入数据库


        // 将sysUser信息存入数据库
        return  sysUserDao.addSysUser(sysUser);
    }


    @Override
    public SysUser findByUsername(String username) {
        return sysUserDao.findByUsername(username);

    }
}
