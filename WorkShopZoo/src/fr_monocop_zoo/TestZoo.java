package fr_monocop_zoo;

public class TestZoo {

	public static void main(String[] args) {
		
		Requins Jaws = new Requins();
		Jaws.setNom("Jaws");
		Jaws.setDescription(" et je suis un requin ");
		Jaws.setSon("argh");
		System.out.println(Jaws.toString());
		
		Chimpanze Cheeta = new Chimpanze();
		Cheeta.setNom("Cheeta");
		Cheeta.setDescription(" et je suis un Chimpanze ");
		Cheeta.setSon("hihihi");
		System.out.println(Cheeta.toString());
		
		Requins Hams = new Requins();
		Hams.setNom("Hams");
		Hams.setDescription(" et je suis un requin ");
		Hams.setSon("argh");
		System.out.println(Hams.toString());
		
				
	}

}
