//package p1;
//
//import jade.core.Profile;
//import jade.core.ProfileImpl;
//import jade.wrapper.AgentController;
//import jade.wrapper.ContainerController;
//import jade.core.Runtime;
//public class Application {
//	public static void main(String[] args){
//		//Setup the JADE environment
//		Profile myProfile = new ProfileImpl();
//		Runtime myRuntime = Runtime.instance();
//		ContainerController myContainer = myRuntime.createMainContainer(myProfile);
//		try{
//			//Start the agent controller, which is itself an agent (rma)
//			AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma",
//					null);
//			rma.start();
//			//Now start our own SimpleAgent, called Fred.
//			
////			//SIMPLE AGENT - CREATES A AGENT
////			AgentController SimpleAgent = myContainer.createNewAgent("Fred",
////					SimpleAgent.class.getCanonicalName(), null);
////			SimpleAgent.start();
////			
////			//END SIMPLE AGENT - CREATES A AGENT
////			
////			//TIMER AGENT, COUNTDOWN BEFORE DELETING
////			AgentController TimerAgent = myContainer.createNewAgent("John",
////					TimerAgent.class.getCanonicalName(), null);
////			TimerAgent.start();
////			//END TIMER AGENT, COUNTDOWN BEFORE DELETING
////			
////			//TICKER AGENT DELETES WHEN GETS TO NUMBER//
////			AgentController TickerAgent = myContainer.createNewAgent("Sam",
////					TickerAgent.class.getCanonicalName(), null);
////			TickerAgent.start();
////			
////			//END TICKER AGENT DELETES WHEN GETS TO NUMBER//
//			
//			//NEWSIMEPLE AGENT , PRINTS EVER 10 secs//
//			
////			AgentController NewSimpleAgent  = myContainer.createNewAgent("Jim",
////					NewSimpleAgent.class.getCanonicalName(), null);
//			
////			NewSimpleAgent.start();
////			//END NEWSIMEPLE AGENT , PRINTS EVER 10 secs//
//			//WAKER AGENT 
////			AgentController WakerSimpleAgent  = myContainer.createNewAgent("Molly",
////					WakerSimpleAgent.class.getCanonicalName(), null);
////			WakerSimpleAgent.start();
////			//END WAKERAGENT
////			
////			AgentController NewSimpleAgent2  = myContainer.createNewAgent("Bolly",
////					NewSimpleAgent2.class.getCanonicalName(), null);
////			NewSimpleAgent2.start();
////			
////			AgentController TimeAgent  = myContainer.createNewAgent("Jolly",
////					TimeAgent.class.getCanonicalName(), null);
////			TimeAgent.start();
//			
////			AgentController FSMAgent  = myContainer.createNewAgent("Polly",
////					FSMAgent.class.getCanonicalName(), null);
////			FSMAgent.start();
//
//			AgentController ComplexBehaviourAgent  = myContainer.createNewAgent("Polly",
//					ComplexBehaviourAgent.class.getCanonicalName(), null);
//			ComplexBehaviourAgent.start();
//
//
//			
//	
//			
//		}catch(Exception e){
//			System.out.println("Exception starting agent: " + e.toString());
//		}
//	}
//}