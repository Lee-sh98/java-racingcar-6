package racingcar.util;

import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static racingcar.constant.TestConstants.BLANK_STRING;
import static racingcar.constant.TestConstants.EMPTY_STRING;
import static racingcar.constant.TestConstants.EXPECTED_ONE_CAR_NAME;
import static racingcar.constant.TestConstants.EXPECTED_PLAY_FIVE_TIMES;
import static racingcar.constant.TestConstants.EXPECTED_PLAY_ONE_TIME;
import static racingcar.constant.TestConstants.EXPECTED_THREE_CAR_NAMES;
import static racingcar.constant.TestConstants.LONGER_THAN_FIVE_STRING;
import static racingcar.constant.TestConstants.NOT_NUMBER_STRING;
import static racingcar.constant.TestConstants.NULL_STRING;
import static racingcar.constant.TestConstants.ONE_CAR_NAME;
import static racingcar.constant.TestConstants.PLAY_FIVE_TIMES;
import static racingcar.constant.TestConstants.PLAY_NEGATIVE_TIME;
import static racingcar.constant.TestConstants.PLAY_NO_TIME;
import static racingcar.constant.TestConstants.PLAY_ONE_TIME;
import static racingcar.constant.TestConstants.THREE_CAR_NAMES;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class TestConstantsProvider {


    public static Stream<Arguments> provideValidCarNameConstants() {
        return Stream.of(
                arguments(named("1", ONE_CAR_NAME), EXPECTED_ONE_CAR_NAME),
                arguments(named("3", THREE_CAR_NAMES), EXPECTED_THREE_CAR_NAMES)
        );
    }

    public static Stream<Arguments> provideInvalidCarNameConstants() {
        return Stream.of(
                arguments(named("null", NULL_STRING)),
                arguments(named("빈 문자열", EMPTY_STRING)),
                arguments(named("공백 문자열", BLANK_STRING)),
                arguments(named("5자 이상의 문자열", LONGER_THAN_FIVE_STRING))
        );
    }

    public static Stream<Arguments> provideValidPlayNumberConstants() {
        return Stream.of(
                arguments(named("1", PLAY_ONE_TIME), EXPECTED_PLAY_ONE_TIME),
                arguments(named("5", PLAY_FIVE_TIMES), EXPECTED_PLAY_FIVE_TIMES)
        );
    }

    public static Stream<Arguments> provideInvalidPlayNumberConstants() {
        return Stream.of(
                arguments(named("null", NULL_STRING)),
                arguments(named("빈 문자열", EMPTY_STRING)),
                arguments(named("공백 문자열", BLANK_STRING)),
                arguments(named("0", PLAY_NO_TIME)),
                arguments(named("0보다 작은 값", PLAY_NEGATIVE_TIME)),
                arguments(named("숫자가 아닌 값", NOT_NUMBER_STRING))
        );
    }

}
