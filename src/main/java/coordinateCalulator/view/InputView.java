package coordinateCalulator.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static String getInput() throws IOException {
        // (10,10)-(14,15)
        System.out.println("좌표를 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pointsString = br.readLine();

        return pointsString;
    }
}
