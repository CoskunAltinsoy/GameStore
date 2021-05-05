package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class OrderManager implements OrderService{

	@Override
	public void add(Order order) {
		System.out.println(order.getId()+ " numaralý oyun eklendi");
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId()+ " numaralý oyun silindi");
	}
	
	@Override
	public void update(Order order) {
		System.out.println(order.getId()+ " numaralý oyun güncellendi");
	}

	@Override
	public void buy(Game game, Customer customer, Campaign campaign) {
		System.out.println(customer.getFirstName() + customer.getLastName()+ "adlý kullanýcý"
				+game.getName()+ " adlý oyunu yüzde" + campaign.getDiscount()+ " ile " + campaign.priceAfterDiscount()
				+" fiyatýna aldý");
	}

	@Override
	public void buyWithoutCampaign(Game game, Customer customer, Campaign campaign) {
		System.out.println(customer.getFirstName() + customer.getLastName()+ "adlý kullanýcý"
				+game.getName()+ " adlý oyunu" + campaign.getPrice()
				+" fiyatýna aldý");
	}
	
}
