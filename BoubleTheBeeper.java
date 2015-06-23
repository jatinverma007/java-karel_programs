import stanford.karel.Karel;
//import stanford.karel.*;

//turnLeft()
//move()
//pickBeeper()
//putBeeper()

//beepersPresent()
//frontIsClear()
//rightIsClear()
//leftIsClear()

public class BoubleTheBeeper extends Karel {
	public void run() {
		while ((frontIsClear() || leftIsClear() || rightIsClear())) {
			moveToTheEnd();
			moveup();
			moveupToend();
			moveToTheRight();
		}
	}

	public void moveupToend() {
		while (frontIsClear()) {
			move();
		}
	}

	public void moveToTheRight() {
		if (rightIsClear()) {
			turnRight();
		}
	}

	public void moveToTheEnd() {
		if (frontIsClear()) {
			move();
		}
	}

	public void moveup() {
		if (leftIsClear()) {
			turnLeft();
			moveupToend();
		}

	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
		while (frontIsClear())
			move();
	}
}