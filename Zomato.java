class Zomato{

    public static double search(String item){

		double price = 0.0;

		if(item == "Masala Dosa"){

			price = 120.00;

		}else if(item == "Plain Dosa"){

			price = 90.00;

		}else if(item == "Mysore Masala Dosa"){

			price = 150.00;

		}else if(item == "Idli"){

			price = 60.00;

		}else if(item == "Vada"){

			price = 50.00;

		}else if(item == "Poori Bhaji"){

			price = 100.00;

		}else if(item == "Upma"){

			price = 80.00;

		}else if(item == "Bisi Bele Bath"){

			price = 160.00;

		}else if(item == "Veg Fried Rice"){

			price = 220.00;

		}else if(item == "Paneer Fried Rice"){

			price = 260.00;

		}else if(item == "Hakka Noodles"){

			price = 210.00;

		}else if(item == "Gobi Manchurian"){

			price = 230.00;

		}else if(item == "Veg Burger"){

			price = 180.00;

		}else if(item == "Cheese Burger"){

			price = 220.00;

		}else if(item == "Chicken Burger"){

			price = 260.00;

		}else if(item == "Veg Pizza"){

			price = 320.00;

		}else if(item == "Paneer Pizza"){

			price = 380.00;

		}else if(item == "Chicken Pizza"){

			price = 420.00;

		}else if(item == "Veg Biryani"){

			price = 250.00;

		}else if(item == "Chicken Biryani"){

			price = 320.00;

		}else if(item == "Paneer Butter Masala"){

			price = 320.00;

		}else if(item == "Butter Chicken"){

			price = 380.00;

		}else if(item == "Butter Naan"){

			price = 50.00;

		}else if(item == "Dal Fry"){

			price = 190.00;

		}else if(item == "Veg Momos"){

			price = 170.00;

		}else if(item == "Pav Bhaji"){

			price = 180.00;

		}else if(item == "Chole Bhature"){

			price = 190.00;

		}else if(item == "Gulab Jamun"){

			price = 90.00;

		}else if(item == "Brownie"){

			price = 180.00;

		}else if(item == "Cold Coffee"){

			price = 180.00;

		}else{

			System.out.println("Invalid");

		}

		return price;
	}
	
	    public static double search(String item,int quantity){

			double price = 0.0;

			if(item == "Masala Dosa"){

				price = 120.00 * quantity;

			}else if(item == "Plain Dosa"){

				price = 90.00 * quantity;

			}else if(item == "Mysore Masala Dosa"){

				price = 150.00 * quantity;

			}else if(item == "Idli"){

				price = 60.00 * quantity;

			}else if(item == "Vada"){

				price = 50.00 * quantity;

			}else if(item == "Poori Bhaji"){

				price = 100.00 * quantity;

			}else if(item == "Upma"){

				price = 80.00 * quantity;

			}else if(item == "Bisi Bele Bath"){

				price = 160.00 * quantity;

			}else if(item == "Veg Fried Rice"){

				price = 220.00 * quantity;

			}else if(item == "Paneer Fried Rice"){

				price = 260.00 * quantity;

			}else if(item == "Hakka Noodles"){

				price = 210.00 * quantity;

			}else if(item == "Gobi Manchurian"){

				price = 230.00 * quantity;

			}else if(item == "Veg Burger"){

				price = 180.00 * quantity;

			}else if(item == "Cheese Burger"){

				price = 220.00 * quantity;

			}else if(item == "Chicken Burger"){

				price = 260.00 * quantity;

			}else if(item == "Veg Pizza"){

				price = 320.00 * quantity;

			}else if(item == "Paneer Pizza"){

				price = 380.00 * quantity;

			}else if(item == "Chicken Pizza"){

				price = 420.00 * quantity;

			}else if(item == "Veg Biryani"){

				price = 250.00 * quantity;

			}else if(item == "Chicken Biryani"){

				price = 320.00 * quantity;

			}else if(item == "Paneer Butter Masala"){

				price = 320.00 * quantity;

			}else if(item == "Butter Chicken"){

				price = 380.00 * quantity;

			}else if(item == "Butter Naan"){

				price = 50.00 * quantity;

			}else if(item == "Dal Fry"){

				price = 190.00 * quantity;

			}else if(item == "Veg Momos"){

				price = 170.00 * quantity;

			}else if(item == "Pav Bhaji"){

				price = 180.00 * quantity;

			}else if(item == "Chole Bhature"){

				price = 190.00 * quantity;

			}else if(item == "Gulab Jamun"){

				price = 90.00 * quantity;

			}else if(item == "Brownie"){

				price = 180.00 * quantity;

			}else if(item == "Cold Coffee"){

				price = 180.00 * quantity;

			}else{

				System.out.println("Invalid");

			}

			return price;
		}
		
		  public static void main(String[] args){

			String name = "Masala Dosa";

			double cost = search(name);

			System.out.println("Price of " + name + " is " + cost);

			int quantity = 2;

			double price = search(name, quantity);

			System.out.println("Price of " + quantity + " " + name + " is " + price);

		}
		
}