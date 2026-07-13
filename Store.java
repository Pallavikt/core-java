class Store {

    public static void main(String args[]) {
        System.out.println(1 + 4 + "3" + 5);
    }

}

//output=535
//first it will add 1 and 4,
//then "3" is a string it will print 3 as it is,
//and 5 will also taken as string as the previous element is string.
//(any element that comes after string("3") will be considered as string 
//example: for 1+2+"5"+6+9+5 output = 35695