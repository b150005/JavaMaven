public class TestClass {
    private String str = "";
    private int i = 0;

    // コンストラクタ
    public TestClass(){}
    public TestClass(String str) {
        this.str = str;
    }
    public TestClass(int i) {
        this.i = i;
    }
    public TestClass(String str, int i) {
        this.str = str;
        this.i = i;
    }

    // ゲッタ
    public String getStr() {
        return this.str;
    }
    public int getI() {
        return this.i;
    }
    
    // セッタ
    public void setStr(String str) {
        this.str = str;
    }
    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "(" + this.str + ", " + this.i + ")";
    }

    public void plus(int i) {
        this.i += i;

        if (i >= 0) {
            // アサーションによるテスト
            assert this.i >= (this.i - i);
        }
        else {
            assert this.i < (this.i - i);
        }
    }
    public void minus(int i) {
        this.i -= i;

        if (i >= 0) {
            // アサーションによるテスト(エラーメッセージつき)
            assert this.i <= (this.i + i) : "calculation has failed.";
        }
        else {
            assert this.i > (this.i + i) : "calculation has failed.";
        }
    }
}