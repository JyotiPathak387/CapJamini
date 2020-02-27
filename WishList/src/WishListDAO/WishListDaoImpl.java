package WishListDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import WishList1.WishList;
public class WishListDaoImpl implements  WishListDao{

	private Map<Integer,WishList> map;
	public WishListDaoImpl()
	{
		map=new HashMap<Integer, WishList>();
	}
	@Override
	public int AddProductToWishList(WishList product) throws WishListException {
		// TODO Auto-generated method stub
		boolean flag= map.containsKey(product.getProductId());
		if(flag)
		{
			throw new WishListException("productId already Exist");
		}
		map.put(product.getProductId(), product);
		return product.getProductId();
	}
	@Override
	public List<WishList> FindAllProductInWishList() throws WishListException {
		// TODO Auto-generated method stub
		Collection<WishList> col=map.values();
		List<WishList> list=new ArrayList<>();
		
		for(WishList w: col)
		{
			list.add(w);
		}
		
		return list;
	}
}
