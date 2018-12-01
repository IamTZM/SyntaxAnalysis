package cn.experiment.symbols;

import java.util.List;

public class Separator extends Token {
    private static List<String> separator;
    private static int TAG = 5;

    public Separator(String fileName) {
        super(fileName);
        separator = super.getTokens();
    }

    public List<String> getSeparatorList() {
        return separator;
    }

    @Override
    public int getTAG() {
        return TAG;
    }

    @Override
    public String getDetail() {
        return "Separator";
    }
}
