package TD5;

public abstract class Article {
	protected long ref;
	protected String lib;
	protected float p;
	protected int q;
	protected static float tva=0.1f;
	
	public Article(long ref, String lib, float p, int q) {
		this.ref=ref;
		this.lib=lib;
		this.p=p;
		this.q=q;
	}
	
	//
	public void approvisionner(int nb) {
		this.q+=nb;
	}
	
	public void decrire() {
		System.out.println("reference "+this.ref+" unite d article "+this.lib+" ");
	}
	
	public abstract float calculPrixTTC();
	
	public boolean appartientPromo() {
			return false;
	}
	
	public boolean estDispo(int qteAchat) {
		if(this.q<=qteAchat) {
			return true;
		}else {
			return false;
		}
	}
}
