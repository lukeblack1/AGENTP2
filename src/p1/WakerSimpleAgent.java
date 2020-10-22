package p1;

import jade . core . AID ;
import jade . core . Agent ;

import jade . core . behaviours . WakerBehaviour ;


import java.util.concurrent.ThreadLocalRandom;



public class WakerSimpleAgent extends Agent {
	protected void setup ()
	{


		int randomNum = ThreadLocalRandom.current().nextInt(0, 120);
		addBehaviour (new WakerBehaviour(this, randomNum) 
				//	addBehaviour(new TickerBehaviour(this, 100)

				{
			//call onTick every 1000ms
			protected void onWake() {
				// Count down

				System.out.println(myAgent.getName()+"....."+ randomNum);
				myAgent.doDelete();
				

			}

				}

				);
	}
}












