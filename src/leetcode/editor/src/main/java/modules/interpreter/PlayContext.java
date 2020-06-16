package modules.interpreter;

/**
 * 演奏内容
 *
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 10:12
 */
public class PlayContext {

    private String text;
    public PlayContext(){

    }
    public PlayContext(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
