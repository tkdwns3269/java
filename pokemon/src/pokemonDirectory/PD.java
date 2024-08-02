package pokemonDirectory;

public class PD {
	private String name;
	private String type;
	private int HP;
	private int Atk;
	private int Def;
	private int SAtk;
	private int SDef;
	private int Spd;
	private int BaseStats;

	public PD() {
		super();
	}

	public PD(String name, String type, int hP, int atk, int def, int sAtk, int sDef, int spd, int baseStats) {
		super();
		this.name = name;
		this.type = type;
		HP = hP;
		Atk = atk;
		Def = def;
		SAtk = sAtk;
		SDef = sDef;
		Spd = spd;
		BaseStats = baseStats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	public void setDef(int def) {
		Def = def;
	}

	public int getSAtk() {
		return SAtk;
	}

	public void setSAtk(int sAtk) {
		SAtk = sAtk;
	}

	public int getSDef() {
		return SDef;
	}

	public void setSDef(int sDef) {
		SDef = sDef;
	}

	public int getSpd() {
		return Spd;
	}

	public void setSpd(int spd) {
		Spd = spd;
	}

	public int getBaseStats() {
		return BaseStats;
	}

	public void setBaseStats(int baseStats) {
		BaseStats = baseStats;
	}

	@Override
	public String toString() {
		return "PD 이름 : " + name + " type=" + type + "  체력 : " + HP + " 공격 : " + Atk + " 방어 : " + Def + " 특수공격 : "
				+ SAtk + " 특수방어 : " + SDef + " 스피드 " + Spd + " 종족값 총합 : " + BaseStats;
	}

}
