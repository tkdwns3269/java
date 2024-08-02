package pokemonDirectory;

public class PDController {
	private PD[] pokeDex = new PD[151];

	public PDController(PD[] pokeDex) {
		super();
		pokeDex[0] = new PD("이상해씨", "풀", 45, 49, 49, 65, 65, 45, 318);
		
		this.pokeDex = pokeDex;
	}

}
