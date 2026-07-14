class SmartWatch{

    static boolean isOn;
    static int brightness;
    static int maxBrightness = 5;
    static int minBrightness = 0;

    public static void power(){

        if(isOn == false){

		isOn = true;

		System.out.println("Watch is Turned ON! " + isOn);
		
		}else{
		
		isOn = false;

		System.out.println("Watch is Turned OFF! " + isOn);
		
		}

	}

    public static void increaseBrightness(){

        if(isOn){

            if(brightness < maxBrightness){

                brightness = brightness+1;
            }

            System.out.println("Brightness increased to: " + brightness);

        }else{

            System.out.println("Turn ON SmartWatch");
        }
    }

    public static void decreaseBrightness(){

        if(isOn){

            if(brightness > minBrightness){

                brightness = brightness-1;
            }

            System.out.println("Brightness decreased to: " + brightness);

        }else{

            System.out.println("Turn ON SmartWatch");
        }
    }
}