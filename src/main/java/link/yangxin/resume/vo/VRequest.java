package link.yangxin.resume.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yangxin
 * @date 2019/12/12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VRequest<T> extends Request<T>  {
}