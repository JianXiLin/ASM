package com.jianxilin.ssm.dao;

import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.entity.ComployeeExample;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author JianxiLin
 * @date 4.29 - 9:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ComployeeMapperTest {

    @Autowired
    private  ComployeeMapper comployeeMapper;

    @Test
    public void selectByPrimaryKey() {
        Comployee comployee = comployeeMapper.selectByPrimaryKey("0001");
        System.out.println(comployee.getComployeeName());

    }

    @Test
    public void selectByExample(){
        List<Comployee> comployees = comployeeMapper.selectByExample(new ComployeeExample());
        for (Comployee comployee:comployees){
            System.out.println(comployee.getComployeeName());
        }
    }

    @Test
    public void selectByExampleWithRowbounds(){
        RowBounds rowBounds = new RowBounds(1, 2);
        ComployeeExample example = new ComployeeExample();
        List<Comployee> comployees = comployeeMapper.selectByExampleWithRowbounds(example, rowBounds);
        for (Comployee comployee:comployees) {
            System.out.println(comployee.getComployeeName());
        }
    }

    @Test
    public void insert(){
        Comployee comployee = new Comployee();
        comployee.setComployeeNo("0001");
        comployee.setAddress("");
        comployee.setAge(155);
        comployee.setComployeeName("1");
        comployee.setComployeeStatus("saf");
        comployee.setSex("男");
        comployee.setProfession("");
        comployee.setDept("");
        comployee.setPhone("151515");
        System.out.println(comployee.toString());

        int insert = comployeeMapper.insert(comployee);
        System.out.println(insert);

    }

    public void searchByKey(){

    }
}