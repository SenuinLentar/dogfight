package jpu2016.dogfight;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.view.*;

public class Dogfight {

	public static void main(String[] args) {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();

		//Dans le main, c�est vous qui cr�erez les avions et les nuages.
		//L�ordre dans lequel vous le ferez aura une incidence sur le jeu.
		//En effet, les premiers cr��s seront sous les autres. Si vous cr�ez les avions avant les nuages, ces derniers cacheront les avions.
		//Vous pouvez donc tout � fait cr�er des nuages devant et d�autres derri�res les avions.
		//Les missiles (cr��s pendant la partie et donc en dernier) seront eux toujours devant.
		//Si ce n�est pas le cas, c�est que la vue a dans sa boucle d�affichage commenc� par la fin et mobiles.
	}

}
