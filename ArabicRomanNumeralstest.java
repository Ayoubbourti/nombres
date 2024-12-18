package nombres;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralstest {

        @Test
        public void convert_1_into_I() {

            int i = 1;
            String expected = "I";
            ArabicRomanNumerals converter = new ArabicRomanNumerals();
            String result = converter.convert(i);
            assertThat(result).isEqualTo(expected);
        }
        @Test
        public void convert_2_into_II() {

            int i = 2;
            String expected = "II";
            ArabicRomanNumerals converter = new ArabicRomanNumerals();
            String result = converter.convert(i);
            assertThat(result).isEqualTo(expected);
        }
    @Test
    public void convert_3_into_III() {

        int i = 3;
        String expected = "III";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_10_into_X() {

        int i = 10;
        String expected = "X";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_20_into_XX() {

        int i = 20;
        String expected = "XX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_300_into_XXX() {

        int i = 30;
        String expected = "XXX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_30_into_XXX() {

        int i = 30;
        String expected = "XXX";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_11_into_XI() {

        int i = 11;
        String expected = "XI";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void convert_12_into_XII() {

        int i = 12;
        String expected = "XII";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_13_into_XIII() {

        int i = 13;
        String expected = "XIII";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_5_into_V() {

        int i = 5;
        String expected = "V";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        String result = converter.convert(i);
        assertThat(result).isEqualTo(expected);
    }
}
