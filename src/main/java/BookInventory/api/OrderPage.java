package BookInventory.api;

import BookInventory.Services.SupplierOrderService;
import BookInventory.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@RestController
@RequestMapping(value="/order/**")
public class OrderPage {
    @Autowired
    private SupplierOrderService service;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<Order> getOrders(@PathVariable Long id){
        return service.getOrders(id);
    }
}
