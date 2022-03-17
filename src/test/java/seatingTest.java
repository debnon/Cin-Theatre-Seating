import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class seatingTest {

    Seating seating;

    @BeforeEach
    public void seatingInit() {
        seating = new Seating();
    }

    static Stream<Arguments> seatingAndSeatNumberingProviderFirstRow() {
        return Stream.of(
                arguments("A1", 0),
                arguments("A2", 1),
                arguments("A3", 2),
                arguments("A4", 3),
                arguments("A5", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("seatingAndSeatNumberingProviderFirstRow")
    public void seatingFirstRow(String seat, Integer seatNum) {
        Assertions.assertEquals(seat, seating.getSeats().get(seatNum));
    }

    static Stream<Arguments> seatingAndSeatNumberingProviderSecondRow() {
        return Stream.of(
                arguments("B1", 5),
                arguments("B2", 6),
                arguments("B3", 7),
                arguments("B4", 8),
                arguments("B5", 9)
        );
    }

    @ParameterizedTest
    @MethodSource("seatingAndSeatNumberingProviderSecondRow")
    public void seatingSecondRow(String seat, Integer seatNum) {
        Assertions.assertEquals(seat, seating.getSeats().get(seatNum));
    }

    static Stream<Arguments> seatingAndSeatNumberingProviderThirdRow() {
        return Stream.of(
                arguments("C1", 10),
                arguments("C2", 11),
                arguments("C3", 12),
                arguments("C4", 13),
                arguments("C5", 14)
        );
    }

    @ParameterizedTest
    @MethodSource("seatingAndSeatNumberingProviderThirdRow")
    public void seatingThirdRow(String seat, Integer seatNum) {
        Assertions.assertEquals(seat, seating.getSeats().get(seatNum));
    }
}
