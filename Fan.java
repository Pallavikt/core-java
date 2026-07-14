class Fan{

    static boolean isOn;
    static int speed;
    static int maxSpeed = 5;
    static int minSpeed = 0;

    public static void switchFan(){

        if(isOn == false){

		isOn = true;

		System.out.println("Fan is Turned ON! " + isOn);
		
		}else{
		
		isOn = false;

		System.out.println("Fan is Turned OFF! " + isOn);
		
		}

	}
    public static void increaseSpeed(){

        if(isOn){

            if(speed < maxSpeed){

                speed = speed+1;
            }

            System.out.println("Speed increased to : " + speed);

        }else{

            System.out.println("Turn ON Fan");
        }
    }

    public static void decreaseSpeed(){

        if(isOn){

            if(speed > minSpeed){

                speed = speed-1;
            }

            System.out.println("Speed decreased to: " + speed);

        }else{

            System.out.println("Turn ON Fan");
        }
    }
}