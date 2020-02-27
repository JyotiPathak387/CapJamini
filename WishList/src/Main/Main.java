package Main;

import java.util.List;
import java.util.Scanner;

import junit.framework.Assert;
import WishList1.WishList;
import WishListDAO.WishListDao;
import WishListDAO.WishListDaoImpl;
import WishListDAO.WishListException;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		WishListDao w1=new WishListDaoImpl();
		
		int choice=0;
		WishList w=null;
		List<WishList> list=null;
		System.out.println("******************************************************");
		System.out.println("Welcome to Wishlist Management System");
		System.out.println("******************************************************");
		while(true)
		{
			System.out.println("1. Add product to WishList");
			System.out.println("2. View WishList");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
		    choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter Product Id: ");
		    	int pid=sc.nextInt();
		    	
		    	w=new WishList();
		    	w.setProduct_id(pid);
		    	//Assert.assertEquals(10,pid);
                
		    	try
		    	{
		    		int id=w1.AddProductToWishList(w);
		    		
		    		System.out.println("Product Id "+id+"  Successfully added to WishList");
		    	}
		    	catch(WishListException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break;
		    	
		    case 2:
		    	try{
		    		list = w1.FindAllProductInWishList();
		    		for(WishList l: list)
		    		{
		    			
		    			System.out.println("ProductId "+l.getProductId());
		    		}
		    	   }
		    	catch(WishListException e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break;
		    	
		    case 3:
		    	System.out.println("-------THANKYOU ------");
		    	return;
		    	
		    case 4:
		    	System.out.println("-----Incorrect Choice----");
		    	System.out.println("----Enter Correct Choice----");
		    	break;
		    }
		}
	}
}
