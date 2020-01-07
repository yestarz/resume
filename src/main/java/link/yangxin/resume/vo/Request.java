package link.yangxin.resume.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/12/12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Request<T> implements Serializable {

    private T param;

}