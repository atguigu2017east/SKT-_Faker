package com.atguigu.git.test;

import org.junit.Test;

import com.atguigu.git.entities.DemoGitEntities;

/**
 * 
 * @ClassName DemoGitTest
 * @Description TODO(Git测试类)
 * @author Yanzh
 * @Date 2017年11月23日 下午3:39:26
 * @version 1.0.0
 */
public class DemoGitTest {
    
    @Test
    public void test() {
        // 新建一个实体类对象
        DemoGitEntities entity = new DemoGitEntities();
        
        // 设置属性
        entity.setId(DemoGitEntities.NUM_NO);
        entity.setAge(21);
        entity.setName("SKT1_Faker");
        entity.setHonor(3);
        
        // 打印
        System.out.println(entity);
    }

}
