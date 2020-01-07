package link.yangxin.resume.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 个人技能
 *
 * @author yangxin
 * @date 2020/1/3
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Skill extends BaseEntity{


    // 技能名
    private String name;

    // 技能点
    private Integer value;


}