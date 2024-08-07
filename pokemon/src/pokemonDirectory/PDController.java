package pokemonDirectory;

public class PDController {
	 private ArrayList<PD> pokeDex;

	    public PDController() {
	        pokeDex = new ArrayList<>();
	        pokeDex.add(new PD("이상해씨", "풀", 45, 49, 49, 65, 65, 45, 318));
	        pokeDex.add(new PD("이상해풀", "풀", 60, 62, 63, 80, 80, 60, 405));
	        pokeDex.add(new PD("이상해꽃", "풀", 80, 82, 63, 100, 100, 80, 5258));
	        pokeDex.add(new PD("파이리", "불", 39, 52, 43, 60, 50, 65, 309));
	        pokeDex.add(new PD("리자드", "불", 58, 64, 58, 80, 65, 80, 405));
	        pokeDex.add(new PD("리자몽", "불", 78, 84, 78, 109, 85, 100, 534));
	        pokeDex.add(new PD("꼬부기", "물", 44, 48, 65, 50, 64, 43, 314));
	        pokeDex.add(new PD("어니부기", "물", 59, 63, 80, 65, 80, 58, 405));
	        pokeDex.add(new PD("거북왕", "물", 79, 83, 100, 85, 105, 78, 530));
	        pokeDex.add(new PD("캐터피", "벌레", 45, 30, 35, 20, 20, 45, 195));
	        pokeDex.add(new PD("캐터피", "벌레", 45, 30, 35, 20, 20, 45, 195));
	        pokeDex.add(new PD("캐터피", "벌레", 45, 30, 35, 20, 20, 45, 195));
	        pokeDex.add(new PD("단데기", "벌레", 50, 20, 55, 25, 25, 30, 205));
	        pokeDex.add(new PD("버터플", "벌레", 60, 45, 50, 90, 80, 70, 395));
	    }

	    // 추가적으로 필요하다면 getter 메서드 등을 추가할 수 있습니다.
	    public ArrayList<PD> getPokeDex() {
	        return pokeDex;
	    }
	}
