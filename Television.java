class Television{

    static boolean isOn;
    static int currentChannel;
    static int maxChannel = 10;
    static int minChannel = 1;

    public static void OnOrOff(){

        if(isOn == false){

            isOn = true;
            System.out.println("Television Turned ON");

        }else{

            isOn = false;
            System.out.println("Television Turned OFF");
        }
    }

    public static void nextChannel(){

        if(isOn){

            if(currentChannel < maxChannel){

                currentChannel = currentChannel+1;
                System.out.println("Current Channel changed to max of: " + currentChannel);

            }else{

                System.out.println("Maximum Channel Reached");
            }

        }else{

            System.out.println("Turn ON the Television");
        }
    }

    public static void previousChannel(){

        if(isOn){

            if(currentChannel > minChannel){

               currentChannel = currentChannel-1;
                System.out.println("Current Channel changed to min of: " + currentChannel);

            }else{

                System.out.println("Minimum Channel Reached");
            }

        }else{
 
            System.out.println("Turn ON the Television");
        }
    }

    public static void main(String[] args){

        OnOrOff();

        nextChannel();
        nextChannel();
        previousChannel();

    }
}