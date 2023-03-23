package objectsInjection;

public class Cellphone {
	
//	Charger c;
//	Sim s;
//	public void setC(Charger c) {
//		this.c = c;
//	}
//	public void setS(Sim s) {
//		this.s = s;
//	}
//	@Override
//	public String toString() {
//		return "Cellphone [c=" + c + ", s=" + s + "]";
//	}
	Charger charger;
	public void setCharger(Charger charger) {
		this.charger=charger;
	}
	
	public void accept() {
		charger.power();
	}
	

}
