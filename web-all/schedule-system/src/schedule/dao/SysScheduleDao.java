package schedule.dao;

import schedule.pojo.SysSchedule;

import java.util.List;

public interface SysScheduleDao {
    int addSchedule(SysSchedule schedule);

    List<SysSchedule> findAll();



}
