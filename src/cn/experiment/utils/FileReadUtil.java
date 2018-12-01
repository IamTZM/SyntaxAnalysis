package cn.experiment.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class FileReadUtil {

	public static List<String> ReadSymbols(String fileName) throws IOException {
		// 返回读取指定资源的输入流
		InputStream is = FileReadUtil.class.getResourceAsStream(fileName);
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		String s;
		List<String> list = new ArrayList<>();
		while ((s = in.readLine()) != null)
			list.add(s);

		in.close();
		return list;
	}

	public static String getCode(File file) throws IOException {
		int currentLine = 1;
		BufferedReader in = new BufferedReader(new FileReader(file));
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = in.readLine()) != null) {
			switch (currentLine / 10) {
			case 0:
				sb.append("  ");
				break;
			case 1:
				sb.append(" ");
				break;
			}
			sb.append(currentLine + "| " + s + "\n");
			currentLine++;
		}
		in.close();
		return sb.toString();
	}
}
