package modules.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 解释器模式
 *
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 9:53
 */
public class Client {
     static Pattern slashPattern = Pattern.compile(" ");
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        System.out.println("上海滩：");
        playContext.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 ");
        Expression expression = null;
        try {
            while (playContext.getText().length() > 0) {
                String text = playContext.getText().substring(0, 1);
                switch (text) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                    default:
                }

                expression.interpret(playContext);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
