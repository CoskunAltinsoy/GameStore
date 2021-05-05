package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class OrderManager implements OrderService{

	@Override
	public void add(Order order) {
		System.out.println(order.getId()+ " numaral� oyun eklendi");
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId()+ " numaral� oyun silindi");
	}
	
	@Override
	public void update(Order order) {
		System.out.println(order.getId()+ " numaral� oyun g�ncellendi");
	}

	@Override
	public void buy(Game game, Customer customer, Campaign campaign) {
		System.out.println(customer.getFirstName() + customer.getLastName()+ "adl� kullan�c�"
				+game.getName()+ " adl� oyunu y�zde" + campaign.getDiscount()+ " ile " + campaign.priceAfterDiscount()
				+" fiyat�na ald�");
	}

	@Override
	public void buyWithoutCampaign(Game game, Customer customer, Campaign campaign) {
		System.out.println(customer.getFirstName() + customer.getLastName()+ "adl� kullan�c�"
				+game.getName()+ " adl� oyunu" + campaign.getPrice()
				+" fiyat�na ald�");
	}
	
}
