package cn.experiment;

import java.io.File;
import java.io.IOException;
import java.util.List;

import cn.experiment.results.AnalyseResult;
import cn.experiment.utils.AnalyseUtil;
import cn.experiment.utils.FileReadUtil;

public class Main {

	private static File loadFile = null; // 将要进行词法分析的文件
	private static String code = null; // 源文件字符串
	private static List<AnalyseResult> analyseResults = null; // 分析结果

	public static void main(String[] args) {

		// 传参数
//		String url = args[0];
		// 根据参数找文件
		loadFile = new File("test/test_file.txt");

		// 在控制台输出结果
		System.out.println("源程序：");
		showSourceCode();
		System.out.println("解析结果：");
		showAnalyseTable();
	}

	// 打印源文件
	public static void showSourceCode() {
		try {
			// 获得源代码
			code = FileReadUtil.getCode(loadFile);
			System.out.println(code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 打印词法分析表
	public static void showAnalyseTable() {
		// 获得分析结果
		analyseResults = AnalyseUtil.SyntaxAnalysis(loadFile);
		
		System.out.printf("Line | Tag |    Detail    | Symbol\n");
		System.out.println("-------------------------------------");
		for (AnalyseResult ar : analyseResults) {
			System.out.printf("%3s  |%3s  |%14s| %s\n", ar.getLine(), ar.getTAG(), ar.getDetail(), ar.getSymbol());
		}
		System.out.println("-------------------------------------");
	}

}