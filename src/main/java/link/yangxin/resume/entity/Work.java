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
 * 工作经验
 *
 * @author yangxin
 * @date 2020/1/3
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Work extends BaseEntity{


    // 公司
    private String company;

    // 开始时间
    private Date begin;

    // 结束时间
    private Date end;

    // 职位
    private String job;


}