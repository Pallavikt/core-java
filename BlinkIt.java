class BlinkIt{

    public static double search(String item){

		double price = 0.0;

		if(item == "Aashirvaad Atta"){

			price = 320.00;

		}else if(item == "Fortune Sunflower Oil"){

			price = 180.00;

		}else if(item == "Tata Salt"){

			price = 30.00;

		}else if(item == "Sugar"){

			price = 55.00;

		}else if(item == "Basmati Rice"){

			price = 450.00;

		}else if(item == "Toor Dal"){

			price = 180.00;

		}else if(item == "Moong Dal"){

			price = 160.00;

		}else if(item == "Chana Dal"){

			price = 120.00;

		}else if(item == "Maggi 2-Minute Noodles"){

			price = 15.00;

		}else if(item == "Yippee Noodles"){

			price = 20.00;

		}else if(item == "Britannia Bread"){

			price = 50.00;

		}else if(item == "Amul Butter"){

			price = 310.00;

		}else if(item == "Amul Cheese Slices"){

			price = 140.00;

		}else if(item == "Mother Dairy Curd"){

			price = 50.00;

		}else if(item == "Amul Milk"){

			price = 35.00;

		}else if(item == "Paneer"){

			price = 120.00;

		}else if(item == "Eggs (6 pcs)"){

			price = 60.00;

		}else if(item == "Tomato"){

			price = 40.00;

		}else if(item == "Potato"){

			price = 35.00;

		}else if(item == "Onion"){

			price = 45.00;

		}else if(item == "Banana"){

			price = 60.00;

		}else if(item == "Apple"){

			price = 180.00;

		}else if(item == "Orange"){

			price = 120.00;

		}else if(item == "Coca Cola"){

			price = 50.00;

		}else if(item == "Pepsi"){

			price = 50.00;

		}else if(item == "Sprite"){

			price = 50.00;

		}else if(item == "Lays Chips"){

			price = 20.00;

		}else if(item == "Oreo Biscuits"){

			price = 40.00;

		}else if(item == "Cadbury Dairy Milk Silk"){

			price = 195.00;

		}else if(item == "Bisleri Water"){

			price = 20.00;

		}else{

			System.out.println("Invalid");

		}

		return price;
	}
	
	   public static double search(String item, int quantity){

			double price = 0.0;

			if(item == "Aashirvaad Atta"){

				price = 320.00 * quantity;

			}else if(item == "Fortune Sunflower Oil"){

				price = 180.00 * quantity;

			}else if(item == "Tata Salt"){

				price = 30.00 * quantity;

			}else if(item == "Sugar"){

				price = 55.00 * quantity;

			}else if(item == "Basmati Rice"){

				price = 450.00 * quantity;

			}else if(item == "Toor Dal"){

				price = 180.00 * quantity;

			}else if(item == "Moong Dal"){

				price = 160.00 * quantity;

			}else if(item == "Chana Dal"){

				price = 120.00 * quantity;

			}else if(item == "Maggi 2-Minute Noodles"){

				price = 15.00 * quantity;

			}else if(item == "Yippee Noodles"){

				price = 20.00 * quantity;

			}else if(item == "Britannia Bread"){

				price = 50.00 * quantity;

			}else if(item == "Amul Butter"){

				price = 310.00 * quantity;

			}else if(item == "Amul Cheese Slices"){

				price = 140.00 * quantity;

			}else if(item == "Mother Dairy Curd"){

				price = 50.00 * quantity;

			}else if(item == "Amul Milk"){

				price = 35.00 * quantity;

			}else if(item == "Paneer"){

				price = 120.00 * quantity;

			}else if(item == "Eggs (6 pcs)"){

				price = 60.00 * quantity;

			}else if(item == "Tomato"){

				price = 40.00 * quantity;

			}else if(item == "Potato"){

				price = 35.00 * quantity;

			}else if(item == "Onion"){

				price = 45.00 * quantity;

			}else if(item == "Banana"){

				price = 60.00 * quantity;

			}else if(item == "Apple"){

				price = 180.00 * quantity;

			}else if(item == "Orange"){

				price = 120.00 * quantity;

			}else if(item == "Coca Cola"){

				price = 50.00 * quantity;

			}else if(item == "Pepsi"){

				price = 50.00 * quantity;

			}else if(item == "Sprite"){

				price = 50.00 * quantity;

			}else if(item == "Lays Chips"){

				price = 20.00 * quantity;

			}else if(item == "Oreo Biscuits"){

				price = 40.00 * quantity;

			}else if(item == "Cadbury Dairy Milk Silk"){

				price = 195.00 * quantity;

			}else if(item == "Bisleri Water"){

				price = 20.00 * quantity;

			}else{

				System.out.println("Invalid");

			}

			return price;
		}
		
		  public static void main(String[] args){

				String name = "Aashirvaad Atta";

				double cost = search(name);

				System.out.println("Price of " + name + " is " + cost);

				int quantity = 4;

				double price = search(name, quantity);

				System.out.println("Price of " + quantity + " " + name + " is " + price);

			}
			
}