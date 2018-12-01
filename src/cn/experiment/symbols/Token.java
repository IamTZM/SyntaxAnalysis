package cn.experiment.symbols;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.experiment.utils.FileReadUtil;

public abstract class Token {
	private static List<String> tokens = new ArrayList<>();

    public Token() {
    }

    public Token(String fileName) {
        try {
        	// 获得文件读取结果，以List<String>格式保存
            tokens = FileReadUtil.ReadSymbols(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " NOT FOUND!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected List<String> getTokens() {
        return tokens;
    }

    public abstract int getTAG();

    public abstract String getDetail();
}
