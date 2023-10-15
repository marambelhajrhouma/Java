package EX2;

public class MotDico {
	private static int count=0;
	private int num;
	private String mot;
	private String def;
	
	//
	MotDico(String mot, String def){
		this.num=count++;
		this.mot=mot;
		this.def=def;
	}
	//
	public String getMot() {
		return mot;
	}
	
	public String getDef() {
		return def;
	}
	
	public void setDef(String s) {
		this.def=s;
	}
	
	public void setMot (String s) {
		this.mot=s;
	}
	
	public boolean synonyme (MotDico m) {
		if(this.mot.equals(m.getMot())) {
			return true;
		}else {
			return false;
		}
	}
}
