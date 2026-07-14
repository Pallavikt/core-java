class AirConditioner{

    static boolean isOn;
    static int temperature = 24;
    static int maxTemp = 30;
    static int minTemp = 16;

    public static void power(){

        if(isOn == false){

		isOn = true;

		System.out.println("Airconditioner is Turned ON! " + isOn);
		
		}else{
		
		isOn = false;

		System.out.println("Airconditioner is Turned OFF! " + isOn);
		
		}

	}

    public static void increaseTemperature(){

        if(isOn){

            if(temperature < maxTemp){

                temperature = temperature+1;
            }

            System.out.println("Temperature increased to : " + temperature);

        }else{

            System.out.println("Turn ON AC");
        }
    }

    public static void decreaseTemperature(){

        if(isOn){

            if(temperature > minTemp){

                temperature = temperature-1;
            }

            System.out.println("Temperature decreased to: " + temperature);

        }else{

            System.out.println("Turn ON AC");
        }
    }
}