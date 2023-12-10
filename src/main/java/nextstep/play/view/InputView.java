package nextstep.play.view;

import java.util.Scanner;

import nextstep.play.dto.LadderDto;

public class InputView {

    private static final String ASK_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String ASK_PARTICIPANTS = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";

    private static final Scanner SCANNER = new Scanner(System.in);

    public static LadderDto acquireInfo() {
        System.out.println(ASK_PARTICIPANTS);
        String participants = SCANNER.nextLine();
        System.out.println(ASK_HEIGHT);
        String height = SCANNER.nextLine();

        return new LadderDto(Integer.parseInt(height), participants);
    }
}
