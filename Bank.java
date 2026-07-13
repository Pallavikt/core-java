class Bank{

    public static String fetchName(){
        return "SBI";
    }

    public static String fetchBranch(){
        return "Gubbi";
    }

    public static int fetchEmployees(){
        return 35;
    }

    public static String fetchIFSC(){
        return "SBIN0001234";
    }

    public static void main(String[] args){

        System.out.println("Bank: " + fetchName());
        System.out.println("Branch: " + fetchBranch());
        System.out.println("Employees: " + fetchEmployees());
        System.out.println("IFSC: " + fetchIFSC());

    }
}