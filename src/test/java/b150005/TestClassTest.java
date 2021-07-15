import static org.junit.Assert.*;
import org.junit.Test;

public class TestClassTest {
    // インスタンス化テスト
    // -> テストメソッドには@Testアナテイションを付与
    @Test
    public void instantiate() {
        // インスタンスの生成
        TestClass tc = new TestClass("ABC", 123);

        assertEquals("ABC", tc.getStr());
        assertEquals(123, tc.getI());
    }

    // 増減テスト
    @Test
    public void plusMinus() {
        // インスタンスの生成
        TestClass tc = new TestClass();

        tc.setI(123);

        tc.plus(27);
        assertEquals(150, tc.getI());
        tc.minus(27);
        assertEquals(123, tc.getI());
    }
}