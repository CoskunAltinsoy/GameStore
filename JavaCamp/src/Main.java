import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		GameManager gameManager = new GameManager();
		
		Customer customer1 = new Customer(1,"Mücahit Coþkun", "Altýnsoy", 1996, "1234567890");
		customerManager.add(customer1);
		
		Customer customer2 = new Customer(2,"Mustafa", "Yazýcý", 1995, "01987654321");
		customerManager.add(customer2);

		Game game1 = new Game(1,"NBA2K20",200);
		gameManager.add(game1);

		Game game2 = new Game(2,"FIFA 2020",250);
		gameManager.add(game2);
		
		Campaign campaign1 = new Campaign(1,"Yaz indirimi",30,25);
		campaignManager.add(campaign1);
		
		Campaign campaign2 = new Campaign(2,"Öðrenci indirimi",30,25);
		campaignManager.add(campaign2);
		
		Order order1 = new Order(1,1,1,2,LocalDate.now());
	}

}
