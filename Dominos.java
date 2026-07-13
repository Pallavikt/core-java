class Dominos{

    public static double search(String item){

		double price = 0.0;

		if(item == "Margherita Pizza"){

			price = 249.00;

		}else if(item == "Farmhouse Pizza"){

			price = 459.00;

		}else if(item == "Peppy Paneer Pizza"){

			price = 499.00;

		}else if(item == "Veg Extravaganza Pizza"){

			price = 549.00;

		}else if(item == "Cheese n Corn Pizza"){

			price = 399.00;

		}else if(item == "Mexican Green Wave Pizza"){

			price = 499.00;

		}else if(item == "Indi Tandoori Paneer Pizza"){

			price = 549.00;

		}else if(item == "Double Cheese Margherita"){

			price = 459.00;

		}else if(item == "Cheese Burst Margherita"){

			price = 399.00;

		}else if(item == "Veg Loaded Pizza"){

			price = 379.00;

		}else if(item == "Garlic Breadsticks"){

			price = 169.00;

		}else if(item == "Stuffed Garlic Bread"){

			price = 259.00;

		}else if(item == "Taco Mexicana Veg"){

			price = 199.00;

		}else if(item == "Choco Lava Cake"){

			price = 129.00;

		}else if(item == "Butterscotch Mousse Cake"){

			price = 139.00;

		}else if(item == "Veg Parcel"){

			price = 179.00;

		}else if(item == "Paneer Parcel"){

			price = 199.00;

		}else if(item == "Cheese Dip"){

			price = 35.00;

		}else if(item == "Tomato Ketchup"){

			price = 20.00;

		}else if(item == "Pepsi"){

			price = 70.00;

		}else if(item == "Mirinda"){

			price = 70.00;

		}else if(item == "7UP"){

			price = 70.00;

		}else if(item == "Onion Pizza"){

			price = 329.00;

		}else if(item == "Corn Pizza"){

			price = 349.00;

		}else if(item == "Capsicum Pizza"){

			price = 349.00;

		}else if(item == "Paneer & Onion Pizza"){

			price = 399.00;

		}else if(item == "Veg Burger Pizza"){

			price = 119.00;

		}else if(item == "Paneer Burger Pizza"){

			price = 139.00;

		}else if(item == "Chocolate Lava Combo"){

			price = 249.00;

		}else if(item == "Pizza Mania Combo"){

			price = 299.00;

		}else{

			System.out.println("Invalid");

		}

		return price;
	}
	
	   public static double search(String item, int quantity){

			double price = 0.0;

			if(item == "Margherita Pizza"){

				price = 249.00 * quantity;

			}else if(item == "Farmhouse Pizza"){

				price = 459.00 * quantity;

			}else if(item == "Peppy Paneer Pizza"){

				price = 499.00 * quantity;

			}else if(item == "Veg Extravaganza Pizza"){

				price = 549.00 * quantity;

			}else if(item == "Cheese n Corn Pizza"){

				price = 399.00 * quantity;

			}else if(item == "Mexican Green Wave Pizza"){

				price = 499.00 * quantity;

			}else if(item == "Indi Tandoori Paneer Pizza"){

				price = 549.00 * quantity;

			}else if(item == "Double Cheese Margherita"){

				price = 459.00 * quantity;

			}else if(item == "Cheese Burst Margherita"){

				price = 399.00 * quantity;

			}else if(item == "Veg Loaded Pizza"){

				price = 379.00 * quantity;

			}else if(item == "Garlic Breadsticks"){

				price = 169.00 * quantity;

			}else if(item == "Stuffed Garlic Bread"){

				price = 259.00 * quantity;

			}else if(item == "Taco Mexicana Veg"){

				price = 199.00 * quantity;

			}else if(item == "Choco Lava Cake"){

				price = 129.00 * quantity;

			}else if(item == "Butterscotch Mousse Cake"){

				price = 139.00 * quantity;

			}else if(item == "Veg Parcel"){

				price = 179.00 * quantity;

			}else if(item == "Paneer Parcel"){

				price = 199.00 * quantity;

			}else if(item == "Cheese Dip"){

				price = 35.00 * quantity;

			}else if(item == "Tomato Ketchup"){

				price = 20.00 * quantity;

			}else if(item == "Pepsi"){

				price = 70.00 * quantity;

			}else if(item == "Mirinda"){

				price = 70.00 * quantity;

			}else if(item == "7UP"){

				price = 70.00 * quantity;

			}else if(item == "Onion Pizza"){

				price = 329.00 * quantity;

			}else if(item == "Corn Pizza"){

				price = 349.00 * quantity;

			}else if(item == "Capsicum Pizza"){

				price = 349.00 * quantity;

			}else if(item == "Paneer & Onion Pizza"){

				price = 399.00 * quantity;

			}else if(item == "Veg Burger Pizza"){

				price = 119.00 * quantity;

			}else if(item == "Paneer Burger Pizza"){

				price = 139.00 * quantity;

			}else if(item == "Chocolate Lava Combo"){

				price = 249.00 * quantity;

			}else if(item == "Pizza Mania Combo"){

				price = 299.00 * quantity;

			}else{

				System.out.println("Invalid");

			}

			return price;
		}
		
		   public static void main(String[] args){

				String name = "Margherita Pizza";

				double cost = search(name);

				System.out.println("Price of " + name + " is " + cost);

				int quantity = 3;

				double price = search(name, quantity);

				System.out.println("Price of " + quantity + " " + name + " is " + price);

			}
			
}