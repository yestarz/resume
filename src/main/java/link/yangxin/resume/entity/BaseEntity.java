package link.yangxin.resume.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yangxin
 * @date 2020/1/6
 */
@Data
@MappedSuperclass //表明这是父类，可以将属性映射到子类中使用JPA生成表
@DynamicUpdate //动态赋值
@DynamicInsert //动态插入
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id; //自增主键

    protected Date createTime;

    protected Date updateTime;

}