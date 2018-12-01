package cn.experiment.symbols;

public class UnsignedNumber extends Token {
    private static int TAG = 3;

    @Override
    public int getTAG() {
        return TAG;
    }

    @Override
    public String getDetail() {
        return "UnsignedNumber";
    }
}
