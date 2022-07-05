package com.xing.zhy_rentcar.Mapper;
/*
 * @Author Xing
 * @Date 2022/7/5 16:02
 * @Package com.xing.zhy_rentcar.Mapper
 * @Description
 */

import com.xing.zhy_rentcar.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * MyBatis 接口
 * Emp接口，定义的方法是对emp表的增删改查
 */
public interface EmpMapper {
    //显示所有员工
    @Select("SELECT id,empId,empName,sex,birthday,joinTime,idcard,phone,storeId,password,roleId FROM emp")
    public List<Emp> selectEmp();

    //查询所有员工的数量
    @Select("SELECT COUNT(*) FROM emp;")
    public long getEmpRowCount();

    //根据员工id查找员工
    @Select("SELECT id,empId,empName,sex,birthday,joinTime,idcard,phone,storeId,password,roleId FROM emp WHERE id = #{id}")
    public Emp selectEmpById(int id);

    //根据员工姓名查找员工
    @Select("SELECT id,empId,empName,sex,birthday,joinTime,idcard,phone,storeId,password,roleId FROM emp WHERE empName = #{empName}")
    public Emp selectEmpByEmpName(String empName);

    /**
     * 添加会员
     *
     * @param emp 要添加的会员
     * @return 返回添加行数
     */
    @Insert("INSERT INTO emp(empId,empName,sex,birthday,joinTime,idcard,phone,storeId,password,roleId) " +
            "VALUES (#{empId},#{empName},#{sex},#{birthday},now(),#{idcard},#{phone},#{storeId},#{password},#{roleId})")
    public int insertEmp(Emp emp);

    /**
     * 根据id删除员工
     *
     * @param id 员工id
     * @return
     */
    @Delete("DELETE FROM emp WHERE id = #{id}")
    public int deleteEmpById(int id);

    /**
     * 根据empName删除员工
     *
     * @param empName 员工名称
     * @return
     */
    @Delete("DELETE FROM emp WHERE empName = #{empName}")
    public int deleteEmpById(String empName);

    /**
     * 修改员工信息
     *
     * @param emp 要修改的员工
     * @return
     */
    @Update("UPDATE emp SET empId=#{empId},empName=#{empName},sex=#{sex},birthday=#{birthday},idcard=#{idcard},phone=#{phone}," +
            "password=#{password},roleId=#{roleId} WHERE id =#{id} ")
    public int updateEmp(Emp emp);
}
