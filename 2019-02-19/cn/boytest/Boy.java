package cn.boytest;

public class Boy {

	// Ь������
	private String mXiezi;
	// �Ƿ�̷�
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
		sb.append("�Ƿ�̷���").append(isShortF).append("; ��ʲôЬ��:  ").append(mXiezi);		
				
		return sb.toString();
	}
}
