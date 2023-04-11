//Burak Kurt
//Period 2
import java.util.Random;
public class Pile {

int numMarbles = 0;

public Pile() {
Random random = new Random();
numMarbles = random.nextInt(89) + 11;
}

public int getMarbles() {
return numMarbles;
}

public void removeMarbles(int marblesToRemove) {
numMarbles -= marblesToRemove;
}

}
