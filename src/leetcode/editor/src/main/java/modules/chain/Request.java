package modules.chain;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 9:57
 */
@Data
public class Request {
    private String requestType;
    private String requestContent;
    private Integer requestNumber;
}
