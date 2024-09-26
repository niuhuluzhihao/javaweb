package schedule.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/*
1、实体类的属性名和表格的列名应该对应
2、必须实现序列化接口
3、应该重写累的hashcode和equals方法
4、必须具备无参构造器
5、必须具有getter 和setter方法


可以使用lombok生成内容，getter和setter等一些方法
1、需要有lombok插件
2、检查是否勾选enable annnotation processing    setting --build,exeute--annotation process
3、导入依赖


 */
@AllArgsConstructor
@NoArgsConstructor
@Data   // 相当于getter ，setter，equals，hashcode
public class SysUser implements Serializable {
    private String username;

    private String userPwd;

    private Integer uid;


}
