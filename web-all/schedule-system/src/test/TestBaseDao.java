package test;

import org.junit.BeforeClass;
import org.junit.Test;
import schedule.dao.BaseDao;
import schedule.pojo.SysUser;

import java.util.List;

public class TestBaseDao {
    private static BaseDao baseDao;


    @BeforeClass
    public static  void  initBaseDao(){
        baseDao = new BaseDao();
    }

    // TODO 此处复习一下静态方法
    // TODOO 复习一下java的方法引用


    @Test
    public  void   testbasequeryObject(){
        // 查询用户数量

        // TODO
        // 报错解决，查一下驱动的问题
        String sql = "select count(1) from sys_user";
        Long count = baseDao.basequeryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery(){
        String sql = "select uid ,username,user_pwd userPwd from sys_user";
        List<Object> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);

    }

    @Test
    public void testBaseUpdate(){
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql, 1, "学习java", 0);
        System.out.println(rows);
    }




}
