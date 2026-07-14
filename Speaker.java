class Speaker{

    static boolean isOn;
    static int volume;
    static int maxVolume = 10;
    static int minVolume = 0;

    public static void power(){

        if(isOn == false){

		isOn = true;

		System.out.println("Speaker is Turned ON! " + isOn);
		
		}else{
		
		isOn = false;

		System.out.println("Speaker is Turned OFF! " + isOn);
		
		}

	}

    public static void increaseVolume(){

        if(isOn){

            if(volume < maxVolume){

                volume = volume+1;
            }

            System.out.println("Volume increased to: " + volume);

        }else{

            System.out.println("Turn ON Speaker");
        }
    }

    public static void decreaseVolume(){

        if(isOn){

            if(volume > minVolume){

                volume = volume - 1;
            }

            System.out.println("Volume decreased to: " + volume);

        }else{

            System.out.println("Turn ON Speaker");
        }
    }

    public static void main(String[] args){

        power();

        increaseVolume();
        increaseVolume();

        decreaseVolume();
    }
}