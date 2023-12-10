package nextstep.play.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LadderDto {

    private static int MAX_NAME_LENGTH = 5;

    private int height;
    private List<String> participants;

    public LadderDto(int height, String participants) {
        this.height = height;
        this.participants = getParticipants(participants);
    }

    public int getHeight() {
        return height;
    }

    public List<String> getParticipants() {
        return participants;
    }


    private List<String> getParticipants(String participants) {
        if (participants == null || participants.isBlank()) {
            throw new IllegalArgumentException("이름을 입력 하세요. - " + participants);
        }

        return Stream.of(participants.split(","))
                     .map(this::validateName)
                     .collect(Collectors.toList());
    }

    private String validateName(String name) {
        if (MAX_NAME_LENGTH >= name.length()) {
            return name;
        }

        throw new IllegalArgumentException("이름의 길이는 5글자를 초과할 수 없습니다. - " + name);
    }

    @Override
    public String toString() {
        return "LadderDto{" +
               "height=" + height +
               ", participants=" + participants +
               '}';
    }
}
