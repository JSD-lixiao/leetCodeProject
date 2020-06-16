package modules.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 10:14
 */
public abstract class Expression {
    static Pattern slashPattern = Pattern.compile(" ");

    /**
     * @param playContext 播放neir
     * @author lixiao
     * @date 2020/6/16
     */
    public void interpret(PlayContext playContext) {
        String text = playContext.getText();
        if (text.length() > 0) {
            String[] strArr = text.split(" ");
            String playKey = strArr[0];
            double playValue = Double.parseDouble(strArr[1]);
            execute(playKey, playValue);
            Matcher slashMatcher = slashPattern.matcher(text);
            int index = 0;
            while (slashMatcher.find()) {
                index++;
                if (index == 2) {
                    playContext.setText(playContext.getText().substring(slashMatcher.start() + 1));
                    break;
                }
            }

        }
    }

    public abstract void execute(String key, double value);
}
