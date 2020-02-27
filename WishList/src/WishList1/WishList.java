package WishList1;

public class WishList {

	private int productId;
	
	public WishList(int productId)
	{
		
		this.productId=productId;
	}
	
	public WishList() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void setProduct_id(int productId)
	{
		this.productId=productId;
	}
	public int getProductId()
	{
		return this.productId;
    }
	
}
