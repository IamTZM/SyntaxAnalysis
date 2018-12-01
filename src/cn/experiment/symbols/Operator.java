package cn.experiment.symbols;

import java.util.List;

public class Operator extends Token {
    private static List<String> operators;
    private static int TAG = 4;

    public Operator(String fileName) {
        super(fileName);
        operators = super.getTokens();
    }

    public List<String> getOperatorList() {
        return operators;
    }

    @Override
    public int getTAG() {
        return TAG;
    }

    @Override
    public String getDetail() {
        return "Operator";
    }
}
