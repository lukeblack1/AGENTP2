package p2;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;

public class Application2 {

	public static void main(String[] args){
		 //Setup the JADE environment
		 Profile myProfile = new ProfileImpl();
		 Runtime myRuntime = Runtime.instance();
		 ContainerController myContainer = myRuntime.createMainContainer(myProfile);
		 try{
		 //Start the agent controller, which is itself an agent (rma)
		 AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma",
		null);
		 rma.start();
		 
		 //Now start our own BookBuyerAgent, called buyer.
		 
		 String[] books = {"Java"};
		 AgentController myAgent = myContainer.createNewAgent("buyer",
		 BookBuyerAgent.class.getCanonicalName(), books);
		 myAgent.start();
		 
		
		 AgentController myAgent1 = myContainer.createNewAgent("buyer1",
		 BookBuyerAgent.class.getCanonicalName(), books);
		 myAgent1.start();
		 
		//END BUYERS
		 
		 //SELLERS
		 AgentController BookSellerAgent = myContainer.createNewAgent("Seller",
				 BookSellerAgent.class.getCanonicalName(), books);
		 BookSellerAgent.start();
		 
		 AgentController BookSellerAgent1 = myContainer.createNewAgent("Seller1",
				 BookSellerAgent.class.getCanonicalName(), books);
		 BookSellerAgent1.start();
		 
		 AgentController BookSellerAgent2 = myContainer.createNewAgent("Seller2",
				 BookSellerAgent.class.getCanonicalName(), books);
		 BookSellerAgent2.start();
		 
		 AgentController BookSellerAgent3 = myContainer.createNewAgent("Seller3",
				 BookSellerAgent.class.getCanonicalName(), books);
		 BookSellerAgent3.start();
		 
		 AgentController BookSellerAgent4 = myContainer.createNewAgent("Seller4",
				 BookSellerAgent.class.getCanonicalName(), books);
		 BookSellerAgent4.start();
		 
		//END SELLERS
		 
		}catch(Exception e){
		 System.out.println("Exception starting agent: " + e.toString());
		 }
	}

}
