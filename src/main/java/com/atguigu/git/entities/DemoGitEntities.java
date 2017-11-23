package com.atguigu.git.entities;

/**
 * @ClassName DemoGitEntities
 * @Description TODO(git demo 的实体类)
 * @author Yanzh
 * @Date 2017年11月23日 下午3:38:16
 * @version 1.0.0
 */
public class DemoGitEntities {
    
    public static final Integer NUM_NO = 1;

    private Integer id;

    private String name;

    private Integer age;

    private String position;

    private Integer honor;

    public DemoGitEntities() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DemoGitEntities(Integer id, String name, Integer age, String position, Integer honor) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.honor = honor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "DemoGitEntities [id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", honor="
                + honor + "]";
    }

}
