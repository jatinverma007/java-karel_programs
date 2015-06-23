import stanford.karel.Karel;
import stanford.karel.*;

public class DoubleTheBeeker extends Karel {
	public void run() {

		moveToTheEnd();
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				moveup(true);
			} else {
				moveup(false);
			}
		}
	}

	public void moveToTheEnd() {
		while (frontIsClear())

			pickTheBeeper();

	}

	public void pickTheBeeper() {
		int c = 0;

		pickBeeper(c);

	}

	public void pickBeeper(int a) {
		int d = 0;

		while (beepersPresent()) {
			pickBeeper();
			d++;
		}

		for (int j = 0; j < 2 * d; j++) {
			putBeeper();
		}
		move();
	}

	public void moveup(boolean towardLeft) {
		if (towardLeft) {
			turnLeft();
			move();
			turnLeft();
		}

		else {
			turnRight();
			move();
			turnRight();
		}
		pickTheBeeper();
		moveToTheEnd();
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
