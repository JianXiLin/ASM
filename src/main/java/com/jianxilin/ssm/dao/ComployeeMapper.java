package com.jianxilin.ssm.dao;

import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.entity.ComployeeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ComployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    long countByExample(ComployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int deleteByExample(ComployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int deleteByPrimaryKey(String comployeeNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int insert(Comployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int insertSelective(Comployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    List<Comployee> selectByExampleWithRowbounds(ComployeeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    List<Comployee> selectByExample(ComployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    Comployee selectByPrimaryKey(String comployeeNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comployee record, @Param("example") ComployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int updateByExample(@Param("record") Comployee record, @Param("example") ComployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int updateByPrimaryKeySelective(Comployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comployee
     *
     * @mbg.generated Wed Apr 29 15:27:41 CST 2020
     */
    int updateByPrimaryKey(Comployee record);
}