class Zepto{

    public static double search(String item){
		
		double price = 0.0;
	
	    if(item == "Maggi 2-Minute Noodles"){
			
			price = 15.00;
			
		}else if(item == "Yippee Magic Masala Noodles"){
			
			price = 20.00;
			
		}else if(item == "Cup Noodles"){
			
			price = 55.00;
			
		}else if(item == "MTR Ready-to-Eat Dal Makhani"){
			
			price = 140.00;
			
		}else if(item == "MTR Ready-to-Eat Paneer Butter Masala"){
			
			price = 160.00;
			
		}else if(item == "Haldiram's Veg Biryani"){
			
			price = 120.00;
			
		}else if(item == "Haldiram's Rajma Chawal"){
			
			price =120.00;
			
		}else if(item == "Haldiram's Chole Chawal"){
			
			price = 120.00;
			
		}else if(item == "Frozen Veg Momos"){
			
			price = 180.00;
		
		}else if(item == "Frozen Chicken Momos"){
			
			price = 220.00;
			
		}else if(item == "Frozen French Fries"){
			
			price = 180.00;
			
		}else if(item == "Frozen Veg Nuggets"){
			
			price = 200.00;

        }else if(item == "Frozen Chicken Nuggets"){

            price = 220.00;
			
        }else if(item == "Britannia Bread"){

            price = 50.00;

        }else if(item == "Amul Cheese Slices"){

            price = 140.00;

        }else if(item == "Britannia Cheese Cubes"){

            price = 155.00;

        }else if(item == "Amul Butter"){

            price = 310.00;

        }else if(item == "Mother Dairy Curd"){

            price = 50.00;

        }else if(item == "Amul Lassi"){

            price = 30.00;

        }else if(item == "Yakult Probiotic Drink"){

            price = 95.00;

        }else if(item == "Tropicana Mixed Fruit Juice"){

            price = 120.00;

        }else if(item == "Real Mango Juice"){

            price = 130.00;

        }else if(item == "Coca Cola"){

            price = 50.00;

        }else if(item == "Pepsi"){

            price = 50.00;

        }else if(item == "Lays Magic Masala Chips"){

            price = 20.00;

        }else if(item == "Bingo Mad Angles"){

            price = 25.00;

        }else if(item == "Haldirams Aloo Bhujia"){

            price = 70.00;

        }else if(item == "Cadbury Dairy Milk Silk"){

            price = 195.00;

        }else if(item == "Oreo Biscuits"){

            price = 40.00;

        }else if(item == "Britannia Cake"){

            price = 45.00;
			
		}else{

            System.out.println("Invalid");

		}
		
		return price;
	}
	
	   public static double search(String item,int quantity){
		
		double price = 0.0;
	
	    if(item == "Maggi 2-Minute Noodles"){
			
			price = 15.00*quantity;
			
		}else if(item == "Yippee Magic Masala Noodles"){
			
			price = 20.00*quantity;
			
		}else if(item == "Cup Noodles"){
			
			price = 55.00*quantity;
			
		}else if(item == "MTR Ready-to-Eat Dal Makhani"){
			
			price = 140.00*quantity;
			
		}else if(item == "MTR Ready-to-Eat Paneer Butter Masala"){
			
			price = 160.00*quantity;
			
		}else if(item == "Haldiram's Veg Biryani"){
			
			price = 120.00*quantity;
			
		}else if(item == "Haldiram's Rajma Chawal"){
			
			price =120.00*quantity;
			
		}else if(item == "Haldiram's Chole Chawal"){
			
			price = 120.00*quantity;
			
		}else if(item == "Frozen Veg Momos"){
			
			price = 180.00*quantity;
		
		}else if(item == "Frozen Chicken Momos"){
			
			price = 220.00*quantity;
			
		}else if(item == "Frozen French Fries"){
			
			price = 180.00*quantity;
			
		}else if(item == "Frozen Veg Nuggets"){
			
			price = 200.00*quantity;

        }else if(item == "Frozen Chicken Nuggets"){

            price = 220.00*quantity;
			
        }else if(item == "Britannia Bread"){

            price = 50.00 * quantity;

        }else if(item == "Amul Cheese Slices"){

            price = 140.00 * quantity;

        }else if(item == "Britannia Cheese Cubes"){

            price = 155.00 * quantity;

        }else if(item == "Amul Butter"){

            price = 310.00 * quantity;

        }else if(item == "Mother Dairy Curd"){

            price = 50.00 * quantity;

        }else if(item == "Amul Lassi"){

            price = 30.00 * quantity;

        }else if(item == "Yakult Probiotic Drink"){

            price = 95.00 * quantity;

        }else if(item == "Tropicana Mixed Fruit Juice"){

            price = 120.00 * quantity;

        }else if(item == "Real Mango Juice"){

            price = 130.00 * quantity;

        }else if(item == "Coca Cola"){

            price = 50.00 * quantity;

        }else if(item == "Pepsi"){

            price = 50.00 * quantity;

        }else if(item == "Lays Magic Masala Chips"){

            price = 20.00 * quantity;

        }else if(item == "Bingo Mad Angles"){

            price = 25.00 * quantity;

        }else if(item == "Haldirams Aloo Bhujia"){

            price = 70.00 * quantity;

        }else if(item == "Cadbury Dairy Milk Silk"){

            price = 195.00 * quantity;

        }else if(item == "Oreo Biscuits"){

            price = 40.00 * quantity;

        }else if(item == "Britannia Cake"){

            price = 45.00 * quantity;
			
		}else{

            System.out.println("Invalid");

		}
		
		return price;
	}
	
	   public static void main(String[] args){
		  
		    String name = "Cup Noodles";
			
			double cost = search(name);
			
			System.out.println("Price of "+name+" is "+cost);
			
		    String item = "Cup Noodles";
			
			int quantity = 2;
			
			double price = search(item,quantity);
			
			System.out.println("Price of "+item+" is "+price);
		
	    }
		
}