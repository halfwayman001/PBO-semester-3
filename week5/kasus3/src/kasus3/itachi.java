package kasus3;

public class itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		setDojutsu(); //untuk memanggil void setDojutsu yang isi nya memanggil Mangekyou Sharingan
		System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
}
