package WishListDAO;
import java.util.List;

import WishList1.WishList;
public interface WishListDao {

	public int AddProductToWishList(WishList product) throws WishListException;
	public List<WishList> FindAllProductInWishList() throws WishListException;
}
