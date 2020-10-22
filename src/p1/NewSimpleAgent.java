package p1;


	
	import jade.core.Agent;
	import jade.core.behaviours.Behaviour;
	import jade.core.behaviours.TickerBehaviour;

	public class NewSimpleAgent extends Agent
	{
		//Get the current time - this will be the time that the agent was launched at
		long t0 = System.currentTimeMillis();
		Behaviour loop;
		protected void setup()
		{
			loop = new TickerBehaviour( this, 1000 )
			{
				protected void onTick()
				{
					//Print elapsed time since launch
					System.out.println("/////////////NEW TICKER AGENT/////////");

					System.out.println( System.currentTimeMillis()-t0 + ": " +
							myAgent.getLocalName());
					System.out.println(getAID().getName());
					
					System.out.println("/////////////NEW TICKER AGENT/////////");
				}
			};
			addBehaviour( loop );
		}
	}



