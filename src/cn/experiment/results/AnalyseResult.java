package cn.experiment.results;

public class AnalyseResult {
	private String line;
	private String symbol;
	private String TAG;
	private String detail;

	public AnalyseResult() {
		this(null, null, null, null);
	}

	public AnalyseResult(String line, String symbol, String TAG, String detail) {
		this.line = line;
		this.symbol = symbol;
		this.TAG = TAG;
		this.detail = detail;
	}

	public String getLine() {
		return line;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getTAG() {
		return TAG;
	}

	public String getDetail() {
		return detail;
	}

	@Override
	public String toString() {
		return "line = " + this.getLine() + 
				", TAG = " + this.getTAG() + 
				", detail = " + this.getDetail() + 
				", symbol = " + this.getSymbol();
	}
}
