package modules.bridge;

import lombok.Setter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 10:11
 */
@Setter
public abstract class HandSetBrand {
    protected HandsetSoft handsetSoft;

    public abstract void run();
}
