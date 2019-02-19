package cn.boytest;

public class Boy {

	// 鞋子名称
	private String mXiezi;
	// 是否短发
	private boolean isShortF;
	
	public String getXiezi() {
		return mXiezi;
	}
	public void setXiezi(String mXiezi) {
		this.mXiezi = mXiezi;
	}
	public boolean isShortF() {
		return isShortF;
	}
	public void setShortF(boolean isShortF) {
		this.isShortF = isShortF;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("是否短发：").append(isShortF).append("; 穿什么鞋子:  ").append(mXiezi);		
				
		return sb.toString();
	}
}
