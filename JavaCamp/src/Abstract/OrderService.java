package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public interface OrderService {
	void add(Order order);
	void delete(Order order);
	void update(Order order);
	void buy(Game game, Customer customer, Campaign campaign);
	void buyWithoutCampaign(Game game, Customer customer, Campaign campaign);

}
