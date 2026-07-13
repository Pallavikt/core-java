class Kfc {

    public static double search(String item){

        double price = 0.0;

        if(item == "Chicken Zinger Burger"){

            price = 229.00;

        }else if(item == "Veg Zinger Burger"){

            price = 189.00;

        }else if(item == "Chicken Bucket"){

            price = 699.00;

        }else if(item == "Hot & Crispy Chicken"){

            price = 259.00;

        }else if(item == "Chicken Popcorn Regular"){

            price = 129.00;

        }else if(item == "Chicken Popcorn Large"){

            price = 249.00;

        }else if(item == "Hot Wings"){

            price = 199.00;

        }else if(item == "Boneless Chicken Strips"){

            price = 249.00;

        }else if(item == "Chicken Rice Bowl"){

            price = 249.00;

        }else if(item == "Veg Rice Bowl"){

            price = 199.00;

        }else if(item == "Chicken Wrap"){

            price = 229.00;

        }else if(item == "Veg Wrap"){

            price = 179.00;

        }else if(item == "French Fries"){

            price = 129.00;

        }else if(item == "Peri Peri Fries"){

            price = 149.00;

        }else if(item == "Chicken Nuggets"){

            price = 199.00;
			
		        }else if(item == "Smoky Red Chicken"){

            price = 289.00;

        }else if(item == "Chicken Twister"){

            price = 239.00;

        }else if(item == "Veg Twister"){

            price = 189.00;

        }else if(item == "Chicken Roll"){

            price = 199.00;

        }else if(item == "Chocolate Brownie"){

            price = 129.00;

        }else if(item == "Chocolate Krusher"){

            price = 179.00;

        }else if(item == "Ice Cream Sundae"){

            price = 119.00;

        }else if(item == "Chicken Combo Meal"){

            price = 449.00;

        }else if(item == "Family Bucket"){

            price = 899.00;

        }else if(item == "Pepsi"){

            price = 70.00;

        }else if(item == "Mirinda"){

            price = 70.00;

        }else if(item == "7UP"){

            price = 70.00;

        }else if(item == "Coffee"){

            price = 120.00;

        }else if(item == "Chicken Salad"){

            price = 199.00;

        }else if(item == "Chicken Meal Box"){

            price = 349.00;

        }else{

            System.out.println("Invalid");
        }

        return price;
    }
	
	    public static double search(String item,int quantity){

			double price = 0.0;

			if(item == "Chicken Zinger Burger"){

				price = 229.00 * quantity;

			}else if(item == "Veg Zinger Burger"){

				price = 189.00 * quantity;

			}else if(item == "Chicken Bucket"){

				price = 699.00 * quantity;

			}else if(item == "Hot & Crispy Chicken"){

				price = 259.00 * quantity;

			}else if(item == "Chicken Popcorn Regular"){

				price = 129.00 * quantity;

			}else if(item == "Chicken Popcorn Large"){

				price = 249.00 * quantity;

			}else if(item == "Hot Wings"){

				price = 199.00 * quantity;

			}else if(item == "Boneless Chicken Strips"){

				price = 249.00 * quantity;

			}else if(item == "Chicken Rice Bowl"){

				price = 249.00 * quantity;

			}else if(item == "Veg Rice Bowl"){

				price = 199.00 * quantity;

			}else if(item == "Chicken Wrap"){

				price = 229.00 * quantity;

			}else if(item == "Veg Wrap"){

				price = 179.00 * quantity;

			}else if(item == "French Fries"){

				price = 129.00 * quantity;

			}else if(item == "Peri Peri Fries"){

				price = 149.00 * quantity;

			}else if(item == "Chicken Nuggets"){

				price = 199.00 * quantity;

			}else if(item == "Smoky Red Chicken"){

				price = 289.00 * quantity;

			}else if(item == "Chicken Twister"){

				price = 239.00 * quantity;

			}else if(item == "Veg Twister"){

				price = 189.00 * quantity;

			}else if(item == "Chicken Roll"){

				price = 199.00 * quantity;

			}else if(item == "Chocolate Brownie"){

				price = 129.00 * quantity;

			}else if(item == "Chocolate Krusher"){

				price = 179.00 * quantity;

			}else if(item == "Ice Cream Sundae"){

				price = 119.00 * quantity;

			}else if(item == "Chicken Combo Meal"){

				price = 449.00 * quantity;

			}else if(item == "Family Bucket"){

				price = 899.00 * quantity;

			}else if(item == "Pepsi"){

				price = 70.00 * quantity;

			}else if(item == "Mirinda"){

				price = 70.00 * quantity;

			}else if(item == "7UP"){

				price = 70.00 * quantity;

			}else if(item == "Coffee"){

				price = 120.00 * quantity;

			}else if(item == "Chicken Salad"){

				price = 199.00 * quantity;

			}else if(item == "Chicken Meal Box"){

				price = 349.00 * quantity;

			}else{

				System.out.println("Invalid");

			}

			return price;
		}

    public static void main(String[] args){

        String name = "Chicken Zinger Burger";

        double cost = search(name);

        System.out.println("Price of " + name + " is " + cost);

        int quantity = 5;

        double price = search(name, quantity);

        System.out.println("Price of " + name + " is " + price);

    }
}