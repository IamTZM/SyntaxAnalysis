package cn.experiment.symbols;

public class Identifier extends Token{
	private static int TAG = 2;

    @Override
    public int getTAG() {
        return TAG;
    }

    @Override
    public String getDetail() {
        return "Identifier";
    }
}
