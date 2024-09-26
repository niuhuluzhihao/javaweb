package test;

import org.junit.BeforeClass;
import org.junit.Test;
import schedule.dao.SysScheduleDao;
import schedule.dao.impl.SysScheduleDaoImpl;
import schedule.pojo.SysSchedule;

import java.util.List;

public class TestSysScheduleData {
    private static SysScheduleDao scheduleDao;

    @BeforeClass
    public static void initScheduleDao(){
        scheduleDao = new SysScheduleDaoImpl();
    }
    @Test
    public void  testAddScheSchedule(){

        int rows = scheduleDao.addSchedule(new SysSchedule(2, 2, "学习数据库", 1));
        System.out.println(rows);
    }


    @Test
    public void testFindAll(){
        List<SysSchedule> scheduleList = scheduleDao.findAll();
        scheduleList.forEach(System.out::println);

    }
}
