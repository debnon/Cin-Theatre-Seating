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

    @Test
    public void seatingSecondRow() {
        Assertions.assertEquals("A6", seating.getSeats().get(5));
    }
}
